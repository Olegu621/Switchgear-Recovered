            package p000;

            import com.google.android.gms.common.data.DataHolder;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class fi1 extends di1 {

                /* JADX INFO: renamed from: a */
                public final DataHolder f8217a;

                /* JADX INFO: renamed from: b */
                public final int f8218b;

                /* JADX INFO: renamed from: c */
                public final int f8219c;

                public fi1(DataHolder dataHolder, int i) {
/* 4 */             this.f8217a = dataHolder;
/* 6 */             this.f8218b = i;
/* 12 */            this.f8219c = dataHolder.m2016H1(i);
                }

                @Override // p000.di1
                public final Object zza(ii1 ii1Var) {
/* 7 */             return ii1Var.zza(this.f8217a, this.f8218b, this.f8219c);
                }
            }
