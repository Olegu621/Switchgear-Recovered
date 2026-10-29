            package com.supercell.titan;

            import android.os.Handler;
            import android.os.Looper;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.c72;
            import p000.cp0;
            import p000.e72;
            import p000.j30;
            import p000.ji1;
            import p000.k30;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ScExternalWebView {

                /* JADX INFO: renamed from: b */
                public j30 f5893b;

                /* JADX INFO: renamed from: c */
                public k30 f5894c;

                /* JADX INFO: renamed from: d */
                public c72 f5895d;

                /* JADX INFO: renamed from: f */
                public cp0 f5897f;

                /* JADX INFO: renamed from: i */
                public e72 f5900i;

                /* JADX INFO: renamed from: g */
                public long f5898g = 60000;

                /* JADX INFO: renamed from: h */
                public long f5899h = 0;

                /* JADX INFO: renamed from: a */
                public boolean f5892a = false;

                /* JADX INFO: renamed from: e */
                public final Handler f5896e = new Handler(Looper.getMainLooper());

                /* JADX INFO: renamed from: a */
                public final void m2743a() {
                    Handler handler;
/* 1 */             cp0 cp0Var = this.f5897f;
/* 3 */             if (cp0Var == null || (handler = this.f5896e) == null) {
/* 15 */                return;
                    }
/* 9 */             handler.removeCallbacks(cp0Var);
/* 13 */            this.f5897f = null;
                }

                public void close() {
/* 3 */             m2743a();
/* 8 */             this.f5899h = 0L;
/* 11 */            this.f5892a = false;
                    try {
/* 20 */                GameApp.getInstance().finishActivity(41036);
                    } catch (Exception e) {
/* 43 */                AbstractC1245n0.m4889q("ScExternalWebView", "Failed to finish Custom Tabs activity: " + e.getMessage());
                    }
/* 48 */            if (this.f5895d != null) {
                        try {
/* 60 */                    GameApp.getInstance().getApplicationContext().unbindService(this.f5895d);
                        } catch (Exception e2) {
/* 83 */                    AbstractC1245n0.m4889q("ScExternalWebView", "Failed to unbind Custom Tabs service: " + e2.getMessage());
                        }
/* 87 */                this.f5895d = null;
                    }
                }

                public long getObjPtr() {
/* 1 */             return this.f5899h;
                }

                public void init() {
/* 1 */             GameApp gameApp = GameApp.getInstance();
/* 11 */            gameApp.runOnUiThread(new ji1(6, this, gameApp));
                }

                public boolean isVisible() {
/* 1 */             return this.f5892a;
                }

                public void loadURL(String str) {
/* 11 */            GameApp.getInstance().runOnUiThread(new ji1(5, this, str));
                }

                public native void onClosed();

                public native void onPageFailed(String str);

                public native void onPageFinished(String str);

                public void setObjPtr(long j) {
/* 1 */             this.f5899h = j;
                }

                public void setTimeout(long j) {
/* 1 */             this.f5898g = j;
                }
            }
