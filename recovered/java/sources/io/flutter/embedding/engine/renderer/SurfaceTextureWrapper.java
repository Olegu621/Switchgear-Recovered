            package io.flutter.embedding.engine.renderer;

            import android.graphics.SurfaceTexture;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public class SurfaceTextureWrapper {
                private boolean attached;
                private boolean newFrameAvailable;
                private Runnable onFrameConsumed;
                private boolean released;
                private SurfaceTexture surfaceTexture;

                public SurfaceTextureWrapper(SurfaceTexture surfaceTexture, Runnable runnable) {
/* 5 */             this.newFrameAvailable = false;
/* 7 */             this.surfaceTexture = surfaceTexture;
/* 9 */             this.released = false;
/* 11 */            this.onFrameConsumed = runnable;
                }

                public void attachToGLContext(int i) {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.released) {
/* 7 */                         return;
                            }
/* 12 */                    if (this.attached) {
/* 16 */                        this.surfaceTexture.detachFromGLContext();
                            }
/* 21 */                    this.surfaceTexture.attachToGLContext(i);
/* 25 */                    this.attached = true;
                        } catch (Throwable th) {
/* 30 */                    throw th;
                        }
                    }
                }

                public void detachFromGLContext() {
                    synchronized (this) {
                        try {
/* 4 */                     if (this.attached && !this.released) {
/* 12 */                        this.surfaceTexture.detachFromGLContext();
/* 16 */                        this.attached = false;
                            }
                        } catch (Throwable th) {
/* 24 */                    throw th;
                        }
                    }
                }

                public void getTransformMatrix(float[] fArr) {
/* 3 */             this.surfaceTexture.getTransformMatrix(fArr);
                }

                public void markDirty() {
                    synchronized (this) {
/* 3 */                 this.newFrameAvailable = true;
                    }
                }

                public void release() {
                    synchronized (this) {
                        try {
/* 4 */                     if (!this.released) {
/* 8 */                         this.surfaceTexture.release();
/* 12 */                        this.released = true;
/* 15 */                        this.attached = false;
                            }
                        } catch (Throwable th) {
/* 23 */                    throw th;
                        }
                    }
                }

                public boolean shouldUpdate() {
                    boolean z;
                    synchronized (this) {
/* 2 */                 z = this.newFrameAvailable;
                    }
/* 5 */             return z;
                }

                public SurfaceTexture surfaceTexture() {
/* 1 */             return this.surfaceTexture;
                }

                public void updateTexImage() {
                    synchronized (this) {
                        try {
/* 3 */                     this.newFrameAvailable = false;
/* 7 */                     if (!this.released) {
/* 11 */                        this.surfaceTexture.updateTexImage();
/* 14 */                        Runnable runnable = this.onFrameConsumed;
/* 16 */                        if (runnable != null) {
/* 18 */                            runnable.run();
                                }
                            }
                        } catch (Throwable th) {
/* 27 */                    throw th;
                        }
                    }
                }

/* 13 */        public SurfaceTextureWrapper(SurfaceTexture surfaceTexture) {
/* 14 */            this(surfaceTexture, null);
                }
            }
