            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            
            /* JADX INFO: renamed from: sa */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2174sa extends BroadcastReceiver {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16482a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16483b;

                public /* synthetic */ C2174sa(Object obj, int i) {
/* 1 */             this.f16482a = i;
/* 3 */             this.f16483b = obj;
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    switch (this.f16482a) {
                        case 0:
/* 234 */                   ((AbstractC2211ta) this.f16483b).mo8097n();
/* 237 */                   return;
                        default:
/* 13 */                    df3 df3Var = (df3) this.f16483b;
/* 25 */                    boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
/* 29 */                    C0204c5 c0204c5 = df3Var.f7166a;
/* 31 */                    if (!zEquals) {
/* 45 */                        c0204c5.m1528a("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
/* 227 */                       return;
                            }
/* 55 */                    c0204c5.m1528a("List of extras in received intent:", new Object[0]);
/* 74 */                    for (String str : intent.getExtras().keySet()) {
/* 98 */                        df3Var.f7166a.m1528a("Key: %s; value: %s", str, intent.getExtras().get(str));
                            }
/* 102 */                   C0204c5 c0204c6 = df3Var.f7166a;
/* 108 */                   c0204c6.m1528a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
/* 127 */                   c0204c6.m1528a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
/* 144 */                   c0204c6.m1528a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
/* 179 */                   xc3 xc3Var = new xc3(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
/* 190 */                   df3Var.f7166a.m1528a("ListenerRegistryBroadcastReceiver.onReceive: %s", xc3Var);
                            synchronized (df3Var) {
/* 201 */                       Iterator it = new HashSet(df3Var.f7169d).iterator();
/* 209 */                       while (it.hasNext()) {
/* 217 */                           ((C1922mc) it.next()).getClass();
/* 220 */                           Objects.toString(xc3Var);
                                }
                            }
/* 227 */                   return;
                    }
                }
            }
