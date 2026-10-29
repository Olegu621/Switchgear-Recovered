            package p000;

            import android.os.Handler;
            import android.os.Looper;
            import android.text.Spannable;
            import android.text.SpannableString;
            import android.text.Spanned;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.concurrent.locks.ReentrantReadWriteLock;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sc0 {

                /* JADX INFO: renamed from: j */
                public static final Object f16511j = new Object();

                /* JADX INFO: renamed from: k */
                public static volatile sc0 f16512k;

                /* JADX INFO: renamed from: a */
                public final ReentrantReadWriteLock f16513a;

                /* JADX INFO: renamed from: b */
                public final C1827kd f16514b;

                /* JADX INFO: renamed from: c */
                public volatile int f16515c;

                /* JADX INFO: renamed from: d */
                public final Handler f16516d;

                /* JADX INFO: renamed from: e */
                public final C0218cj f16517e;

                /* JADX INFO: renamed from: f */
                public final rc0 f16518f;

                /* JADX INFO: renamed from: g */
                public final zb0 f16519g;

                /* JADX INFO: renamed from: h */
                public final int f16520h;

                /* JADX INFO: renamed from: i */
                public final y50 f16521i;

                public sc0(ml0 ml0Var) {
/* 6 */             ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
/* 9 */             this.f16513a = reentrantReadWriteLock;
/* 12 */            this.f16515c = 3;
/* 16 */            rc0 rc0Var = (rc0) ml0Var.f15061b;
/* 18 */            this.f16518f = rc0Var;
/* 20 */            int i = ml0Var.f15060a;
/* 22 */            this.f16520h = i;
/* 28 */            this.f16521i = (y50) ml0Var.f15062c;
/* 39 */            this.f16516d = new Handler(Looper.getMainLooper());
/* 47 */            this.f16514b = new C1827kd(0);
/* 55 */            this.f16519g = new zb0(1);
/* 59 */            C0218cj c0218cj = new C0218cj(this);
/* 62 */            this.f16517e = c0218cj;
/* 68 */            reentrantReadWriteLock.writeLock().lock();
/* 71 */            if (i == 0) {
                        try {
/* 73 */                    this.f16515c = 0;
                        } catch (Throwable th) {
/* 83 */                    this.f16513a.writeLock().unlock();
/* 86 */                    throw th;
                        }
                    }
/* 91 */            reentrantReadWriteLock.writeLock().unlock();
/* 98 */            if (m8472b() == 0) {
                        try {
/* 105 */                   rc0Var.mo6481a(new oc0(c0218cj));
                        } catch (Throwable th2) {
/* 110 */                   m8474d(th2);
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public static sc0 m8471a() {
                    sc0 sc0Var;
                    synchronized (f16511j) {
/* 4 */                 sc0Var = f16512k;
/* 13 */                de3.m3028j("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", sc0Var != null);
                    }
/* 17 */            return sc0Var;
                }

                /* JADX INFO: renamed from: b */
                public final int m8472b() {
/* 7 */             this.f16513a.readLock().lock();
                    try {
/* 10 */                return this.f16515c;
                    } finally {
/* 29 */                this.f16513a.readLock().unlock();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m8473c() {
/* 12 */            de3.m3028j("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.f16520h == 1);
/* 19 */            if (m8472b() == 1) {
/* 21 */                return;
                    }
/* 28 */            this.f16513a.writeLock().lock();
                    try {
/* 33 */                if (this.f16515c == 0) {
/* 41 */                    this.f16513a.writeLock().unlock();
/* 44 */                    return;
                        }
/* 45 */                this.f16515c = 0;
/* 53 */                this.f16513a.writeLock().unlock();
/* 56 */                C0218cj c0218cj = this.f16517e;
/* 60 */                sc0 sc0Var = (sc0) c0218cj.f2931a;
                        try {
/* 69 */                    sc0Var.f16518f.mo6481a(new oc0(c0218cj));
                        } catch (Throwable th) {
/* 74 */                    sc0Var.m8474d(th);
                        }
                    } catch (Throwable th2) {
/* 85 */                this.f16513a.writeLock().unlock();
/* 88 */                throw th2;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m8474d(Throwable th) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 12 */            this.f16513a.writeLock().lock();
                    try {
/* 16 */                this.f16515c = 2;
/* 20 */                arrayList.addAll(this.f16514b);
/* 25 */                this.f16514b.clear();
/* 34 */                this.f16513a.writeLock().unlock();
/* 46 */                this.f16516d.post(new RunnableC2503ym(arrayList, this.f16515c, th));
                    } catch (Throwable th2) {
/* 57 */                this.f16513a.writeLock().unlock();
/* 60 */                throw th2;
                    }
                }

                /* JADX WARN: Code duplicated, block: B:100:? A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:52:0x00a6 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:32:0x0061, B:35:0x0066, B:37:0x006a, B:39:0x0077, B:46:0x0096, B:48:0x00a0, B:50:0x00a3, B:52:0x00a6, B:54:0x00b6, B:55:0x00b9), top: B:95:0x0061 }] */
                /* JADX WARN: Code duplicated, block: B:54:0x00b6 A[Catch: all -> 0x0089, TryCatch #2 {all -> 0x0089, blocks: (B:32:0x0061, B:35:0x0066, B:37:0x006a, B:39:0x0077, B:46:0x0096, B:48:0x00a0, B:50:0x00a3, B:52:0x00a6, B:54:0x00b6, B:55:0x00b9), top: B:95:0x0061 }] */
                /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
                /* JADX WARN: Code duplicated, block: B:84:0x010a  */
                /* JADX INFO: renamed from: e */
                public final CharSequence m8475e(CharSequence charSequence, int i, int i2) throws Throwable {
                    Throwable th;
                    CharSequence charSequence2;
                    int i3;
                    int i4;
                    rs2[] rs2VarArr;
                    int spanStart;
/* 6 */             int i5 = 1;
/* 14 */            de3.m3028j("Not initialized yet", m8472b() == 1);
/* 17 */            by2 by2Var = null;
/* 18 */            if (i < 0) {
/* 283 */               C1951n4.m6859j("start cannot be negative");
/* 17 */                return null;
                    }
/* 20 */            if (i2 < 0) {
/* 277 */               C1951n4.m6859j("end cannot be negative");
/* 17 */                return null;
                    }
/* 29 */            de3.m3023e("start should be <= than end", i <= i2);
/* 32 */            if (charSequence == null) {
/* 17 */                return null;
                    }
/* 46 */            de3.m3023e("start should be < than charSequence length", i <= charSequence.length());
/* 60 */            de3.m3023e("end should be < than charSequence length", i2 <= charSequence.length());
/* 67 */            if (charSequence.length() == 0 || i == i2) {
/* 71 */                return charSequence;
                    }
/* 79 */            C0875ec c0875ec = (C0875ec) this.f16517e.f2932b;
/* 81 */            c0875ec.getClass();
/* 84 */            boolean z = charSequence instanceof uf2;
/* 86 */            if (z) {
/* 91 */                ((uf2) charSequence).m9006a();
                    }
/* 96 */            if (z) {
/* 146 */               by2Var = new by2((Spannable) charSequence);
/* 149 */               if (by2Var != null) {
/* 165 */                   for (rs2 rs2Var : rs2VarArr) {
/* 171 */                       spanStart = by2Var.f2637b.getSpanStart(rs2Var);
/* 177 */                       int spanEnd = by2Var.f2637b.getSpanEnd(rs2Var);
/* 181 */                       if (spanStart != i2) {
/* 183 */                           by2Var.removeSpan(rs2Var);
                                }
/* 186 */                       i = Math.min(spanStart, i);
/* 190 */                       i2 = Math.max(spanEnd, i2);
                            }
                        }
/* 197 */               i3 = i;
/* 198 */               i4 = i2;
/* 199 */               if (i3 != i4) {
/* 207 */                   charSequence2 = charSequence;
/* 262 */                   if (!z) {
/* 274 */                       return charSequence2;
                            }
                        } else {
/* 207 */                   charSequence2 = charSequence;
/* 262 */                   if (!z) {
/* 274 */                       return charSequence2;
                            }
                        }
/* 250 */               ((uf2) charSequence2).m9007b();
/* 253 */               return charSequence2;
                    }
                    try {
/* 100 */               if (charSequence instanceof Spannable) {
                            try {
/* 146 */                       by2Var = new by2((Spannable) charSequence);
                            } catch (Throwable th2) {
/* 254 */                       th = th2;
/* 255 */                       charSequence2 = charSequence;
/* 243 */                       th = th;
/* 265 */                       if (!z) {
/* 273 */                           throw th;
                                }
/* 270 */                       ((uf2) charSequence2).m9007b();
/* 273 */                       throw th;
                            }
                        } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, rs2.class) <= i2) {
/* 122 */                   by2Var = new by2();
/* 125 */                   by2Var.f2636a = false;
/* 132 */                   by2Var.f2637b = new SpannableString(charSequence);
                        }
/* 149 */               if (by2Var != null && (rs2VarArr = (rs2[]) by2Var.f2637b.getSpans(i, i2, rs2.class)) != null && rs2VarArr.length > 0) {
/* 165 */                   while (i < r5) {
/* 171 */                       spanStart = by2Var.f2637b.getSpanStart(rs2Var);
/* 177 */                       int spanEnd2 = by2Var.f2637b.getSpanEnd(rs2Var);
/* 181 */                       if (spanStart != i2) {
/* 183 */                           by2Var.removeSpan(rs2Var);
                                }
/* 186 */                       i = Math.min(spanStart, i);
/* 190 */                       i2 = Math.max(spanEnd2, i2);
                            }
                        }
/* 197 */               i3 = i;
/* 198 */               i4 = i2;
/* 199 */               if (i3 != i4 || i3 >= charSequence.length()) {
/* 207 */                   charSequence2 = charSequence;
/* 262 */                   if (!z) {
/* 274 */                       return charSequence2;
                            }
                        } else {
                            try {
/* 222 */                       charSequence2 = charSequence;
                                try {
/* 227 */                           by2 by2Var2 = (by2) c0875ec.m3371I(charSequence2, i3, i4, AbstractC0208c9.API_PRIORITY_OTHER, false, new wc0(i5, by2Var, (zb0) c0875ec.f7613b));
/* 229 */                           if (by2Var2 != null) {
/* 231 */                               Spannable spannable = by2Var2.f2637b;
/* 233 */                               if (z) {
/* 238 */                                   ((uf2) charSequence2).m9007b();
                                        }
/* 241 */                               return spannable;
                                    }
/* 245 */                           if (!z) {
/* 274 */                               return charSequence2;
                                    }
                                } catch (Throwable th3) {
/* 242 */                           th = th3;
/* 243 */                           th = th;
/* 265 */                           if (!z) {
/* 273 */                               throw th;
                                    }
/* 270 */                           ((uf2) charSequence2).m9007b();
/* 273 */                           throw th;
                                }
                            } catch (Throwable th4) {
/* 258 */                       charSequence2 = charSequence;
/* 260 */                       th = th4;
                            }
                        }
/* 250 */               ((uf2) charSequence2).m9007b();
/* 253 */               return charSequence2;
                    } catch (Throwable th5) {
/* 139 */               th = th5;
/* 135 */               charSequence2 = charSequence;
                    }
/* 265 */           if (!z) {
/* 273 */               throw th;
                    }
/* 270 */           ((uf2) charSequence2).m9007b();
/* 273 */           throw th;
                }

                /* JADX INFO: renamed from: f */
                public final void m8476f(qc0 qc0Var) {
/* 3 */             de3.m3027i(qc0Var, "initCallback cannot be null");
/* 12 */            this.f16513a.writeLock().lock();
                    try {
/* 18 */                if (this.f16515c == 1 || this.f16515c == 2) {
/* 52 */                    this.f16516d.post(new RunnableC2503ym(Arrays.asList(qc0Var), this.f16515c, (Throwable) null));
                        } else {
/* 28 */                    this.f16514b.add(qc0Var);
                        }
                    } finally {
/* 71 */                this.f16513a.writeLock().unlock();
                    }
                }
            }
