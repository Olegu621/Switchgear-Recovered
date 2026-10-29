            package p000;

            import com.google.android.gms.common.data.DataHolder;
            import java.util.Iterator;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gi1 extends AbstractC1775j {

                /* JADX INFO: renamed from: b */
                public fi1 f8622b;

                public gi1(DataHolder dataHolder) {
/* 1 */             super(dataHolder);
/* 12 */            dataHolder.f3468f.setClassLoader(gi1.class.getClassLoader());
                }

                @Override // p000.AbstractC1775j
                public final Object get(int i) {
/* 1 */             fi1 fi1Var = this.f8622b;
/* 3 */             if (fi1Var != null && fi1Var.f8218b == i) {
/* 10 */                return fi1Var;
                    }
/* 15 */            fi1 fi1Var2 = new fi1(this.f11978a, i);
/* 18 */            this.f8622b = fi1Var2;
/* 20 */            return fi1Var2;
                }

                @Override // p000.AbstractC1775j, p000.b32
                public final void release() {
/* 1 */             DataHolder dataHolder = this.f11978a;
/* 3 */             if (dataHolder != null) {
/* 11 */                Iterator it = hg3.f9075b.values().iterator();
/* 19 */                while (it.hasNext()) {
/* 27 */                    ((zg3) it.next()).zzb(dataHolder);
                        }
                    }
/* 31 */            super.release();
                }
            }
