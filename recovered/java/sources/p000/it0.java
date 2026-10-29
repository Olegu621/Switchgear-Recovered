            package p000;

            import android.util.Log;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class it0 implements Thread.UncaughtExceptionHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Thread.UncaughtExceptionHandler f11922a;

                public it0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
/* 4 */             this.f11922a = uncaughtExceptionHandler;
                }

                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
/* 3 */             boolean zContains = false;
/* 4 */             if (th != null) {
                        try {
/* 21 */                    zContains = Log.getStackTraceString(th).contains(hu0.class.getPackage().getName());
                        } catch (Exception e) {
/* 29 */                    xe2.m9777o("UncghtExptnHndlr", "Error determining crash from Helpshift", e);
                        }
                    }
/* 32 */            if (zContains) {
/* 36 */                xe2.m9777o("UncghtExptnHndlr", "UNCAUGHT EXCEPTION ", th);
                    }
/* 39 */            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11922a;
/* 41 */            if (uncaughtExceptionHandler != null) {
/* 43 */                uncaughtExceptionHandler.uncaughtException(thread, th);
                    }
                }
            }
