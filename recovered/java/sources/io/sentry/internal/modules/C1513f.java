            package io.sentry.internal.modules;

            import android.content.Context;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.util.AbstractC1704c;
            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.io.InputStream;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            import p000.f72;
            
            /* JADX INFO: renamed from: io.sentry.internal.modules.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 46 */    public final class C1513f extends AbstractC1511d {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ int f11058e = 1;

                /* JADX INFO: renamed from: f */
                public final Object f11059f;

                public C1513f(Context context, SentryAndroidOptions sentryAndroidOptions) {
/* 8 */             super(sentryAndroidOptions.getLogger());
/* 11 */            Context applicationContext = context.getApplicationContext();
/* 18 */            this.f11059f = applicationContext != null ? applicationContext : context;
                    try {
/* 31 */                sentryAndroidOptions.getExecutorService().submit(new f72(this, 24));
                    } catch (Throwable th) {
/* 44 */                sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "AssetsModulesLoader submit failed", th);
                    }
                }

                @Override // io.sentry.internal.modules.AbstractC1511d
                /* JADX INFO: renamed from: b */
                public final Map mo5303b() {
/* 1 */             int i = this.f11058e;
/* 7 */             ILogger iLogger = this.f11054a;
/* 9 */             Object obj = this.f11059f;
                    switch (i) {
                        case 0:
/* 108 */                   TreeMap treeMap = new TreeMap();
                            try {
/* 113 */                       InputStream resourceAsStream = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                                try {
/* 117 */                           if (resourceAsStream == null) {
/* 125 */                               iLogger.mo4672k(EnumC1553m5.INFO, "%s file was not found.", "sentry-external-modules.txt");
/* 128 */                               if (resourceAsStream != null) {
/* 130 */                                   resourceAsStream.close();
                                        }
                                    } else {
/* 140 */                               TreeMap treeMapM5304c = m5304c(resourceAsStream);
/* 144 */                               resourceAsStream.close();
/* 147 */                               treeMap = treeMapM5304c;
                                    }
                                } catch (Throwable th) {
/* 149 */                           if (resourceAsStream != null) {
                                        try {
/* 151 */                                   resourceAsStream.close();
                                        } catch (Throwable th2) {
/* 156 */                                   th.addSuppressed(th2);
                                        }
                                        break;
                                    }
/* 159 */                           throw th;
                                }
                                break;
                            } catch (IOException e) {
/* 164 */                       iLogger.mo4671d(EnumC1553m5.INFO, "Access to resources failed.", e);
                            } catch (SecurityException e2) {
/* 172 */                       iLogger.mo4671d(EnumC1553m5.INFO, "Access to resources denied.", e2);
                            }
/* 175 */                   return treeMap;
                        case 1:
/* 50 */                    TreeMap treeMap2 = new TreeMap();
                            try {
/* 59 */                        InputStream inputStreamOpen = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                                try {
/* 63 */                            TreeMap treeMapM5304c2 = m5304c(inputStreamOpen);
/* 67 */                            if (inputStreamOpen != null) {
/* 69 */                                inputStreamOpen.close();
                                    }
/* 72 */                            return treeMapM5304c2;
                                } catch (Throwable th3) {
/* 77 */                            if (inputStreamOpen != null) {
                                        try {
/* 79 */                                    inputStreamOpen.close();
                                        } catch (Throwable th4) {
/* 84 */                                    th3.addSuppressed(th4);
                                        }
                                        break;
                                    }
/* 87 */                            throw th3;
                                }
                            } catch (FileNotFoundException unused) {
/* 102 */                       iLogger.mo4672k(EnumC1553m5.INFO, "%s file was not found.", "sentry-external-modules.txt");
/* 105 */                       return treeMap2;
                            } catch (IOException e3) {
/* 92 */                        iLogger.mo4671d(EnumC1553m5.ERROR, "Error extracting modules.", e3);
/* 105 */                       return treeMap2;
                            }
                        default:
/* 16 */                    TreeMap treeMap3 = new TreeMap();
/* 21 */                    Iterator it = ((List) obj).iterator();
/* 29 */                    while (it.hasNext()) {
/* 37 */                        Map mapMo5302a = ((InterfaceC1508a) it.next()).mo5302a();
/* 41 */                        if (mapMo5302a != null) {
/* 43 */                            treeMap3.putAll(mapMo5302a);
                                }
                            }
/* 47 */                    return treeMap3;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 47 */        public C1513f(ILogger iLogger) {
/* 49 */            super(iLogger);
/* 48 */            ClassLoader classLoader = C1513f.class.getClassLoader();
/* 50 */            this.f11059f = AbstractC1704c.m5449d(classLoader);
                }

/* 50 */        public C1513f(List list, ILogger iLogger) {
/* 51 */            super(iLogger);
/* 52 */            this.f11059f = list;
                }
            }
