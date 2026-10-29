            package io.sentry.internal.modules;

            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.util.C1702a;
            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.nio.charset.Charset;
            import java.util.Map;
            import java.util.TreeMap;
            
            /* JADX INFO: renamed from: io.sentry.internal.modules.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1511d implements InterfaceC1508a {

                /* JADX INFO: renamed from: d */
                public static final Charset f11053d = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final ILogger f11054a;

                /* JADX INFO: renamed from: b */
                public final C1702a f11055b = new C1702a();

                /* JADX INFO: renamed from: c */
                public volatile Map f11056c = null;

                public AbstractC1511d(ILogger iLogger) {
/* 14 */            this.f11054a = iLogger;
                }

                @Override // io.sentry.internal.modules.InterfaceC1508a
                /* JADX INFO: renamed from: a */
                public final Map mo5302a() {
/* 3 */             if (this.f11056c == null) {
/* 5 */                 C1702a c1702a = this.f11055b;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (this.f11056c == null) {
/* 18 */                        this.f11056c = mo5303b();
                            }
/* 23 */                    c1702a.close();
                        } catch (Throwable th) {
                            try {
/* 27 */                        c1702a.close();
                            } catch (Throwable th2) {
/* 32 */                        th.addSuppressed(th2);
                            }
/* 35 */                    throw th;
                        }
                    }
/* 36 */            return this.f11056c;
                }

                /* JADX INFO: renamed from: b */
                public abstract Map mo5303b();

                /* JADX INFO: renamed from: c */
                public final TreeMap m5304c(InputStream inputStream) {
/* 1 */             ILogger iLogger = this.f11054a;
/* 5 */             TreeMap treeMap = new TreeMap();
                    try {
/* 17 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f11053d));
                        try {
/* 24 */                    for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
/* 28 */                        int iLastIndexOf = line.lastIndexOf(58);
/* 43 */                        treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                            }
/* 69 */                    iLogger.mo4672k(EnumC1553m5.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
/* 72 */                    bufferedReader.close();
/* 75 */                    return treeMap;
                        } catch (Throwable th) {
                            try {
/* 80 */                        bufferedReader.close();
                            } catch (Throwable th2) {
/* 85 */                        th.addSuppressed(th2);
                            }
/* 88 */                    throw th;
                        }
                    } catch (IOException e) {
/* 107 */               iLogger.mo4671d(EnumC1553m5.ERROR, "Error extracting modules.", e);
/* 110 */               return treeMap;
                    } catch (RuntimeException e2) {
/* 99 */                iLogger.mo4670b(EnumC1553m5.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
/* 110 */               return treeMap;
                    }
                }
            }
