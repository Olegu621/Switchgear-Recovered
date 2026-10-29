            package com.supercell.titan;

            import android.view.SurfaceHolder;
            import android.view.SurfaceView;
            import android.view.ViewGroup;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class MoviePlayerSurface implements SurfaceHolder.Callback {

                /* JADX INFO: renamed from: a */
                public SurfaceView f5825a;

                /* JADX INFO: renamed from: b */
                public SurfaceHolder.Callback f5826b;

                public SurfaceView getSurfaceView() {
/* 1 */             return this.f5825a;
                }

                public void hide() {
/* 7 */             this.f5825a.getHolder().removeCallback(this);
/* 20 */            ((ViewGroup) this.f5825a.getParent()).removeView(this.f5825a);
                }

                public void show(SurfaceHolder.Callback callback) {
/* 1 */             this.f5826b = callback;
/* 9 */             SurfaceView surfaceView = new SurfaceView(GameApp.getInstance());
/* 12 */            this.f5825a = surfaceView;
/* 18 */            surfaceView.getHolder().addCallback(this);
/* 33 */            GameApp.getInstance().addContentView(this.f5825a, new ViewGroup.LayoutParams(-1, -1));
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
/* 1 */             SurfaceHolder.Callback callback = this.f5826b;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceChanged(surfaceHolder, i, i2, i3);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceCreated(SurfaceHolder surfaceHolder) {
/* 1 */             SurfaceHolder.Callback callback = this.f5826b;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceCreated(surfaceHolder);
                    }
                }

                @Override // android.view.SurfaceHolder.Callback
                public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
/* 1 */             SurfaceHolder.Callback callback = this.f5826b;
/* 3 */             if (callback != null) {
/* 5 */                 callback.surfaceDestroyed(surfaceHolder);
                    }
                }
            }
