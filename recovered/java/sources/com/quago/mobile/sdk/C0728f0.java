            package com.quago.mobile.sdk;

            import android.opengl.EGL14;
            import android.opengl.EGLConfig;
            import android.opengl.EGLContext;
            import android.opengl.EGLDisplay;
            import android.opengl.EGLSurface;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1697u2;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 29 */    public final class C0728f0 {

                /* JADX INFO: renamed from: a */
                public EGLDisplay f5433a;

                /* JADX INFO: renamed from: b */
                public EGLContext f5434b;

                /* JADX INFO: renamed from: c */
                public EGLConfig f5435c;

                public C0728f0() {
/* 5 */             this.f5433a = null;
/* 7 */             this.f5434b = null;
/* 9 */             this.f5435c = null;
/* 13 */            this.f5433a = EGL14.EGL_NO_DISPLAY;
/* 15 */            EGLContext eGLContext = EGL14.EGL_NO_CONTEXT;
/* 17 */            this.f5434b = eGLContext;
/* 20 */            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
/* 24 */            this.f5433a = eGLDisplayEglGetDisplay;
/* 28 */            if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
/* 93 */                f42.m3663s("failed to get EGL14 display");
/* 96 */                throw null;
                    }
/* 31 */            int[] iArr = new int[2];
/* 38 */            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
/* 83 */                this.f5433a = null;
/* 87 */                f42.m3663s("failed to initialize EGL14");
/* 90 */                throw null;
                    }
/* 44 */            if (this.f5434b == EGL14.EGL_NO_CONTEXT) {
/* 46 */                EGLConfig eGLConfigM2564b = m2564b();
/* 50 */                if (eGLConfigM2564b == null) {
/* 78 */                    f42.m3663s("failed to find a suitable EGLConfig");
/* 81 */                    throw null;
                        }
/* 62 */                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f5433a, eGLConfigM2564b, eGLContext, new int[]{12440, 2, 12344}, 0);
/* 68 */                m2561a("eglCreateContext");
/* 71 */                this.f5435c = eGLConfigM2564b;
/* 73 */                this.f5434b = eGLContextEglCreateContext;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final EGLSurface m2562a() {
/* 18 */            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(this.f5433a, this.f5435c, new int[]{12375, NotificationCompat.FLAG_GROUP_SUMMARY, 12374, NotificationCompat.FLAG_GROUP_SUMMARY, 12344}, 0);
/* 24 */            m2561a("eglCreatePbufferSurface()");
/* 27 */            if (eGLSurfaceEglCreatePbufferSurface != null) {
/* 29 */                return eGLSurfaceEglCreatePbufferSurface;
                    }
/* 32 */            f42.m3663s("surface was null");
/* 35 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public final EGLConfig m2564b() {
/* 9 */             EGLConfig[] eGLConfigArr = new EGLConfig[1];
/* 23 */            if (EGL14.eglChooseConfig(this.f5433a, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
/* 28 */                return eGLConfigArr[0];
                    }
/* 25 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m2566c() {
/* 1 */             EGLDisplay eGLDisplay = this.f5433a;
/* 5 */             if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
/* 7 */                 EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
/* 11 */                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
/* 18 */                EGL14.eglDestroyContext(this.f5433a, this.f5434b);
/* 21 */                EGL14.eglReleaseThread();
/* 26 */                EGL14.eglTerminate(this.f5433a);
                    }
/* 31 */            this.f5433a = EGL14.EGL_NO_DISPLAY;
/* 35 */            this.f5434b = EGL14.EGL_NO_CONTEXT;
/* 38 */            this.f5435c = null;
                }

                /* JADX INFO: renamed from: b */
/* 30 */        public final void m2565b(EGLSurface eGLSurface) {
/* 31 */            if (EGL14.eglMakeCurrent(this.f5433a, eGLSurface, eGLSurface, this.f5434b)) {
                        return;
                    }
/* 32 */            f42.m3663s("failed to eglMakeCurrent()");
                }

                /* JADX INFO: renamed from: a */
/* 36 */        public final void m2563a(EGLSurface eGLSurface) {
/* 37 */            EGL14.eglDestroySurface(this.f5433a, eGLSurface);
                }

                /* JADX INFO: renamed from: a */
/* 37 */        public static void m2561a(String str) {
/* 38 */            int iEglGetError = EGL14.eglGetError();
                    if (iEglGetError == 12288) {
                        return;
                    }
/* 41 */            C1697u2.m5438n(fm0.m3794t(str, ": EGL error: 0x"), Integer.toHexString(iEglGetError));
                }
            }
