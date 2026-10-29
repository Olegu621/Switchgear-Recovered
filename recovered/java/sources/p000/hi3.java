            package p000;

            import android.content.SharedPreferences;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hi3 {

                /* JADX INFO: renamed from: a */
                public final String f9090a;

                /* JADX INFO: renamed from: b */
                public final boolean f9091b;

                /* JADX INFO: renamed from: c */
                public boolean f9092c;

                /* JADX INFO: renamed from: d */
                public boolean f9093d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ki3 f9094e;

                public hi3(ki3 ki3Var, String str, boolean z) {
/* 4 */             this.f9094e = ki3Var;
/* 6 */             kb1.m6058k(str);
/* 9 */             this.f9090a = str;
/* 11 */            this.f9091b = z;
                }

                /* JADX INFO: renamed from: a */
                public final boolean m4238a() {
/* 3 */             if (!this.f9092c) {
/* 6 */                 this.f9092c = true;
/* 22 */                this.f9093d = this.f9094e.m6113D().getBoolean(this.f9090a, this.f9091b);
                    }
/* 24 */            return this.f9093d;
                }

                /* JADX INFO: renamed from: b */
                public final void m4239b(boolean z) {
/* 7 */             SharedPreferences.Editor editorEdit = this.f9094e.m6113D().edit();
/* 13 */            editorEdit.putBoolean(this.f9090a, z);
/* 16 */            editorEdit.apply();
/* 19 */            this.f9093d = z;
                }
            }
