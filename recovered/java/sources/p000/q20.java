            package p000;

            import android.database.ContentObserver;
            import android.database.Cursor;
            import android.os.Handler;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class q20 extends ContentObserver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ni2 f15368a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public q20(ni2 ni2Var) {
/* 8 */             super(new Handler());
/* 1 */             this.f15368a = ni2Var;
                }

                @Override // android.database.ContentObserver
                public final boolean deliverSelfNotifications() {
/* 1 */             return true;
                }

                @Override // android.database.ContentObserver
                public final void onChange(boolean z) {
                    Cursor cursor;
/* 1 */             ni2 ni2Var = this.f15368a;
/* 5 */             if (!ni2Var.f16388b || (cursor = ni2Var.f16389c) == null || cursor.isClosed()) {
/* 25 */                return;
                    }
/* 23 */            ni2Var.f16387a = ni2Var.f16389c.requery();
                }
            }
