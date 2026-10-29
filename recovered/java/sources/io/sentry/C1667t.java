            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.internal.C1502a;
            import io.sentry.util.C1702a;
            import java.io.IOException;
            import java.net.URL;
            import java.util.Enumeration;
            import java.util.jar.Attributes;
            import java.util.jar.Manifest;
            
            /* JADX INFO: renamed from: io.sentry.t */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1667t implements InterfaceC1579p1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11663a;

                /* JADX INFO: renamed from: b */
                public final SentryAndroidOptions f11664b;

                public /* synthetic */ C1667t(SentryAndroidOptions sentryAndroidOptions, int i) {
/* 1 */             this.f11663a = i;
/* 3 */             this.f11664b = sentryAndroidOptions;
                }

                @Override // io.sentry.InterfaceC1579p1
                /* JADX INFO: renamed from: a */
                public final boolean mo5257a() {
                    switch (this.f11663a) {
                        case 0:
/* 284 */                   return C1529k5.m5336d().m5339c(this.f11664b.getFatalLogger());
                        default:
/* 8 */                     if (C1502a.f11036c == null) {
/* 10 */                        C1702a c1702a = C1502a.f11037d;
/* 12 */                        c1702a.m5443c();
                                try {
/* 17 */                            if (C1502a.f11036c == null) {
/* 24 */                                C1502a.f11036c = new C1502a();
                                    }
/* 29 */                            c1702a.close();
                                } catch (Throwable th) {
                                    try {
/* 33 */                                c1702a.close();
                                        break;
                                    } catch (Throwable th2) {
/* 38 */                                th.addSuppressed(th2);
                                    }
/* 41 */                            throw th;
                                }
                                break;
                            }
/* 42 */                    C1502a c1502a = C1502a.f11036c;
/* 46 */                    if (!c1502a.f11038a) {
                                try {
/* 51 */                            C1702a c1702a2 = c1502a.f11039b;
/* 53 */                            c1702a2.m5443c();
                                    try {
/* 58 */                                if (!c1502a.f11038a) {
/* 76 */                                    Enumeration<URL> resources = ClassLoader.getSystemClassLoader().getResources("META-INF/MANIFEST.MF");
/* 84 */                                    while (resources.hasMoreElements()) {
                                                try {
/* 101 */                                           Attributes mainAttributes = new Manifest(resources.nextElement().openStream()).getMainAttributes();
/* 105 */                                           if (mainAttributes != null) {
/* 109 */                                               String value = mainAttributes.getValue("Sentry-Opentelemetry-SDK-Name");
/* 115 */                                               String value2 = mainAttributes.getValue("Implementation-Version");
/* 121 */                                               String value3 = mainAttributes.getValue("Sentry-SDK-Name");
/* 127 */                                               String value4 = mainAttributes.getValue("Sentry-SDK-Package-Name");
/* 131 */                                               if (value != null && value2 != null) {
/* 137 */                                                   String value5 = mainAttributes.getValue("Sentry-Opentelemetry-Version-Name");
/* 141 */                                                   if (value5 != null) {
/* 149 */                                                       C1529k5.m5336d().m5338b("maven:io.opentelemetry:opentelemetry-sdk", value5);
/* 158 */                                                       C1529k5.m5336d().m5337a("OpenTelemetry");
                                                            }
/* 166 */                                                   String value6 = mainAttributes.getValue("Sentry-Opentelemetry-Javaagent-Version-Name");
/* 170 */                                                   if (value6 != null) {
/* 178 */                                                       C1529k5.m5336d().m5338b("maven:io.opentelemetry.javaagent:opentelemetry-javaagent", value6);
/* 187 */                                                       C1529k5.m5336d().m5337a("OpenTelemetry-Agent");
                                                            }
/* 196 */                                                   if (value.equals("sentry.java.opentelemetry.agentless")) {
/* 204 */                                                       C1529k5.m5336d().m5337a("OpenTelemetry-Agentless");
                                                            }
/* 213 */                                                   if (value.equals("sentry.java.opentelemetry.agentless-spring")) {
/* 221 */                                                       C1529k5.m5336d().m5337a("OpenTelemetry-Agentless-Spring");
                                                            }
                                                        }
/* 224 */                                               if (value3 != null && value2 != null && value4 != null && value3.startsWith("sentry.java")) {
/* 242 */                                                   C1529k5.m5336d().m5338b(value4, value2);
                                                        }
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        }
/* 60 */                                c1702a2.close();
                                    } catch (Throwable th3) {
                                        try {
/* 247 */                                   c1702a2.close();
                                            break;
                                        } catch (Throwable th4) {
/* 252 */                                   th3.addSuppressed(th4);
                                        }
/* 255 */                               throw th3;
                                    }
                                    break;
                                } catch (IOException unused2) {
                                } catch (Throwable th5) {
/* 256 */                           c1502a.f11038a = true;
/* 258 */                           throw th5;
                                }
/* 63 */                        c1502a.f11038a = true;
                            }
/* 269 */                   return C1529k5.m5336d().m5339c(this.f11664b.getFatalLogger());
                    }
                }
            }
