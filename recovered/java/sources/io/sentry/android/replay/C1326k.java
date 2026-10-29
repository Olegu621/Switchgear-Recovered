            package io.sentry.android.replay;

            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.C1181d;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1702a;
            import java.io.BufferedReader;
            import java.io.Closeable;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.InputStreamReader;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.collections.CollectionsKt;
            import kotlin.text.Charsets;
            import kotlin.text.StringsKt__StringsKt;
            import okio.Segment;
            import p000.C1982nz;
            import p000.C2066pd;
            import p000.C2270uw;
            import p000.gi0;
            import p000.h22;
            import p000.hk2;
            import p000.jb1;
            import p000.r51;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1326k implements Closeable {

                /* JADX INFO: renamed from: U */
                public final LinkedHashMap f10550U;

                /* JADX INFO: renamed from: V */
                public final hk2 f10551V;

                /* JADX INFO: renamed from: a */
                public final C1554m6 f10552a;

                /* JADX INFO: renamed from: b */
                public final C1626w f10553b;

                /* JADX INFO: renamed from: c */
                public final AtomicBoolean f10554c;

                /* JADX INFO: renamed from: d */
                public final C1702a f10555d;

                /* JADX INFO: renamed from: e */
                public final C1702a f10556e;

                /* JADX INFO: renamed from: f */
                public final C1702a f10557f;

                /* JADX INFO: renamed from: i */
                public C1181d f10558i;

                /* JADX INFO: renamed from: v */
                public final hk2 f10559v;

                /* JADX INFO: renamed from: w */
                public final ArrayList f10560w;

                public C1326k(C1554m6 c1554m6, C1626w c1626w) {
/* 1 */             c1554m6.getClass();
/* 4 */             c1626w.getClass();
/* 10 */            this.f10552a = c1554m6;
/* 12 */            this.f10553b = c1626w;
/* 20 */            this.f10554c = new AtomicBoolean(false);
/* 27 */            this.f10555d = new C1702a();
/* 34 */            this.f10556e = new C1702a();
/* 41 */            this.f10557f = new C1702a();
/* 53 */            this.f10559v = r51.m8065b(new C1323h(this, 1));
/* 60 */            this.f10560w = new ArrayList();
/* 67 */            this.f10550U = new LinkedHashMap();
/* 78 */            this.f10551V = r51.m8065b(new C1323h(this, 0));
                }

                /* JADX INFO: renamed from: c */
                public final void m5013c(File file, long j, String str) throws Exception {
/* 3 */             C1327l c1327l = new C1327l(file, j, str);
/* 6 */             C1702a c1702a = this.f10557f;
/* 8 */             c1702a.m5443c();
                    try {
/* 13 */                this.f10560w.add(c1327l);
/* 17 */                xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 22 */                    throw th;
                        } catch (Throwable th2) {
/* 24 */                    xe2.m9770h(c1702a, th);
/* 27 */                    throw th2;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
/* 1 */             C1702a c1702a = this.f10555d;
/* 3 */             c1702a.m5443c();
                    try {
/* 6 */                 C1181d c1181d = this.f10558i;
/* 8 */                 if (c1181d != null) {
/* 10 */                    c1181d.m4781f();
                        }
/* 17 */                this.f10558i = null;
/* 19 */                xe2.m9770h(c1702a, null);
/* 25 */                this.f10554c.set(true);
                    } catch (Throwable th) {
                        try {
/* 29 */                    throw th;
                        } catch (Throwable th2) {
/* 31 */                    xe2.m9770h(c1702a, th);
/* 34 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5014f(File file) {
/* 3 */             C1554m6 c1554m6 = this.f10552a;
                    try {
/* 9 */                 if (file.delete()) {
/* 31 */                    return;
                        }
/* 25 */                c1554m6.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
                    } catch (Throwable th) {
/* 46 */                c1554m6.getLogger().mo4670b(EnumC1553m5.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
                    }
                }

                /* JADX INFO: renamed from: g */
                public final File m5015g() {
/* 7 */             return (File) this.f10559v.getValue();
                }

                /* JADX INFO: renamed from: h */
                public final void m5016h(String str, String str2) {
                    File file;
                    File file2;
/* 1 */             hk2 hk2Var = this.f10551V;
/* 3 */             LinkedHashMap linkedHashMap = this.f10550U;
/* 5 */             C1702a c1702a = this.f10556e;
/* 7 */             c1702a.m5443c();
                    try {
/* 17 */                if (this.f10554c.get()) {
/* 19 */                    xe2.m9770h(c1702a, null);
/* 22 */                    return;
                        }
/* 27 */                File file3 = (File) hk2Var.getValue();
/* 30 */                if ((file3 == null || !file3.exists()) && (file = (File) hk2Var.getValue()) != null) {
/* 51 */                    file.createNewFile();
                        }
/* 58 */                if (linkedHashMap.isEmpty() && (file2 = (File) hk2Var.getValue()) != null) {
/* 84 */                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), Segment.SIZE);
                            try {
/* 98 */                        Iterator it = new C1982nz(new C2066pd(bufferedReader, 2)).iterator();
/* 106 */                       while (it.hasNext()) {
/* 7 */                             List listSplit$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 2, 2, null);
/* 137 */                           linkedHashMap.put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
                                }
/* 144 */                       bufferedReader.close();
                            } catch (Throwable th) {
                                try {
/* 148 */                           throw th;
                                } catch (Throwable th2) {
/* 151 */                           jb1.m5754n(bufferedReader, th);
/* 154 */                           throw th2;
                                }
                            }
                        }
/* 155 */               if (str2 == null) {
/* 157 */                   linkedHashMap.remove(str);
                        } else {
/* 161 */                   linkedHashMap.put(str, str2);
                        }
/* 168 */               File file4 = (File) hk2Var.getValue();
/* 170 */               if (file4 != null) {
/* 172 */                   Set setEntrySet = linkedHashMap.entrySet();
/* 176 */                   setEntrySet.getClass();
/* 191 */                   gi0.m3946c(file4, CollectionsKt.m6203x(setEntrySet, "\n", null, null, C1324i.f10545a, 30));
                        }
/* 194 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th3) {
                        try {
/* 198 */                   throw th3;
                        } catch (Throwable th4) {
/* 201 */                   xe2.m9770h(c1702a, th3);
/* 204 */                   throw th4;
                        }
                    }
                }

                /* JADX INFO: renamed from: i */
                public final String m5017i(long j) throws Exception {
/* 3 */             h22 h22Var = new h22();
/* 6 */             C1702a c1702a = this.f10557f;
/* 8 */             c1702a.m5443c();
                    try {
/* 21 */                C2270uw.m9143n(this.f10560w, new C1325j(j, this, h22Var, 0));
/* 25 */                xe2.m9770h(c1702a, null);
/* 30 */                return (String) h22Var.f8873a;
                    } catch (Throwable th) {
                        try {
/* 35 */                    throw th;
                        } catch (Throwable th2) {
/* 38 */                    xe2.m9770h(c1702a, th);
/* 41 */                    throw th2;
                        }
                    }
                }
            }
