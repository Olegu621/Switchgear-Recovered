            package io.sentry.util;

            import io.sentry.C1160a5;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.ILogger;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.clientreport.InterfaceC1416f;
            import io.sentry.internal.debugmeta.C1505c;
            
            /* JADX INFO: renamed from: io.sentry.util.h */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1709h implements InterfaceC1416f {
                /* JADX INFO: renamed from: b */
                public static boolean m5473b(C1554m6 c1554m6, String str) {
/* 9 */             return m5474d(str, c1554m6 != null ? c1554m6.getLogger() : null);
                }

                /* JADX INFO: renamed from: d */
                public static boolean m5474d(String str, ILogger iLogger) {
                    return m5475f(iLogger, str, false) != null;
                }

                /* JADX INFO: renamed from: f */
                public static Class m5475f(ILogger iLogger, String str, boolean z) {
                    try {
/* 7 */                 return Class.forName(str, z, C1709h.class.getClassLoader());
                    } catch (ClassNotFoundException unused) {
/* 44 */                if (iLogger == null) {
/* 60 */                    return null;
                        }
/* 57 */                iLogger.mo4672k(EnumC1553m5.INFO, "Class not available: ".concat(str), new Object[0]);
/* 60 */                return null;
                    } catch (UnsatisfiedLinkError e) {
/* 30 */                if (iLogger == null) {
/* 60 */                    return null;
                        }
/* 40 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
/* 60 */                return null;
                    } catch (Throwable th) {
/* 16 */                if (iLogger == null) {
/* 60 */                    return null;
                        }
/* 26 */                iLogger.mo4671d(EnumC1553m5.ERROR, "Failed to initialize ".concat(str), th);
/* 60 */                return null;
                    }
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: a */
                public void mo5158a(EnumC1414d enumC1414d, EnumC1560n enumC1560n) {
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: c */
                public void mo5159c(EnumC1414d enumC1414d, C1505c c1505c) {
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: e */
                public void mo5160e(EnumC1414d enumC1414d, EnumC1560n enumC1560n, long j) {
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: g */
                public void mo5161g(EnumC1414d enumC1414d, C1160a5 c1160a5) {
                }

                @Override // io.sentry.clientreport.InterfaceC1416f
                /* JADX INFO: renamed from: h */
                public C1505c mo5162h(C1505c c1505c) {
/* 1 */             return c1505c;
                }
            }
