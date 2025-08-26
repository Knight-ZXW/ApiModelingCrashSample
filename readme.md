Issue: ApiModeling causes SurfaceTexture to crash during runtime execution.

Root Cause: 
    SurfaceTexture implements a finalize method that triggers JNI (Java Native Interface) functions. 
    During R8's external linking phase, an additional object is created to maintain proper class loading sequence. 
    However, this object's initialization instruction is not invoked, leaving it in an incomplete state.
Crash Mechanism: 
    When the garbage collector attempts to reclaim this improperly initialized object, it triggers the finalize method, which results in a native crash due to the uninitialized object state.

