            package io.sentry.android.core;

            import android.content.SharedPreferences;
            import java.io.File;
            import java.util.HashMap;
            import java.util.Objects;
            import p000.kb1;
            import p000.ki3;
            
            /* JADX INFO: renamed from: io.sentry.android.core.s */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class C1268s {

                /* JADX INFO: renamed from: a */
                public final long f10297a;

                /* JADX INFO: renamed from: b */
                public boolean f10298b;

                /* JADX INFO: renamed from: c */
                public long f10299c;

                /* JADX INFO: renamed from: d */
                public final Object f10300d;

                /* JADX INFO: renamed from: e */
                public final Object f10301e;

                public C1268s(ki3 ki3Var, String str, long j) {
/* 4 */             Objects.requireNonNull(ki3Var);
/* 7 */             this.f10301e = ki3Var;
/* 9 */             kb1.m6058k(str);
/* 12 */            this.f10300d = str;
/* 14 */            this.f10297a = j;
                }

                /* JADX INFO: renamed from: a */
                public long m4932a() {
/* 3 */             if (!this.f10298b) {
/* 6 */                 this.f10298b = true;
/* 10 */                ki3 ki3Var = (ki3) this.f10301e;
/* 26 */                this.f10299c = ki3Var.m6113D().getLong((String) this.f10300d, this.f10297a);
                    }
/* 28 */            return this.f10299c;
                }

                /* JADX INFO: renamed from: b */
                public void m4933b(long j) {
/* 9 */             SharedPreferences.Editor editorEdit = ((ki3) this.f10301e).m6113D().edit();
/* 17 */            editorEdit.putLong((String) this.f10300d, j);
/* 20 */            editorEdit.apply();
/* 23 */            this.f10299c = j;
                }

/* 16 */        public C1268s(long j, long j2, boolean z, File file, HashMap map) {
/* 18 */            this.f10297a = j;
/* 19 */            this.f10300d = file;
/* 20 */            this.f10299c = j2;
/* 21 */            this.f10301e = map;
/* 22 */            this.f10298b = z;
                }
            }
