            package p000;

            import android.app.PendingIntent;
            import android.os.Bundle;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gq3 extends jo3 {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ wq3 f8784d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public gq3(wq3 wq3Var, TaskCompletionSource taskCompletionSource, String str) {
/* 10 */            super(wq3Var, new C0204c5("OnRequestInstallCallback"), taskCompletionSource);
/* 1 */             this.f8784d = wq3Var;
                }

                @Override // p000.jo3, com.google.android.play.core.appupdate.internal.zzh
                /* JADX INFO: renamed from: K */
                public final void mo2443K(Bundle bundle) {
/* 5 */             super.mo2443K(bundle);
/* 11 */            int i = bundle.getInt("error.code", -2);
/* 15 */            TaskCompletionSource taskCompletionSource = this.f12412b;
/* 17 */            if (i != 0) {
/* 28 */                taskCompletionSource.trySetException(new my0(bundle.getInt("error.code", -2)));
/* 31 */                return;
                    }
/* 35 */            bundle.getInt("version.code", -1);
/* 40 */            int i2 = bundle.getInt("update.availability");
/* 47 */            int i3 = bundle.getInt("install.status", 0);
/* 57 */            if (bundle.getInt("client.version.staleness", -1) != -1) {
/* 60 */                bundle.getInt("client.version.staleness");
                    }
/* 65 */            bundle.getInt("in.app.update.priority", 0);
/* 70 */            bundle.getLong("bytes.downloaded");
/* 75 */            bundle.getLong("total.bytes.to.download");
/* 80 */            long j = bundle.getLong("additional.size.required");
/* 86 */            lr3 lr3Var = this.f8784d.f18756d;
/* 88 */            lr3Var.getClass();
/* 104 */           long jM6527a = lr3.m6527a(new File(lr3Var.f13465a.getFilesDir(), "assetpacks"));
/* 115 */           PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
/* 124 */           PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
/* 133 */           PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
/* 143 */           PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
/* 147 */           HashMap map = new HashMap();
/* 154 */           ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
/* 162 */           HashSet hashSet = new HashSet();
/* 165 */           if (integerArrayList != null) {
/* 167 */               hashSet.addAll(integerArrayList);
                    }
/* 170 */           map.put("blocking.destructive.intent", hashSet);
/* 175 */           ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
/* 181 */           HashSet hashSet2 = new HashSet();
/* 184 */           if (integerArrayList2 != null) {
/* 186 */               hashSet2.addAll(integerArrayList2);
                    }
/* 189 */           map.put("nonblocking.destructive.intent", hashSet2);
/* 194 */           ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
/* 200 */           HashSet hashSet3 = new HashSet();
/* 203 */           if (integerArrayList3 != null) {
/* 205 */               hashSet3.addAll(integerArrayList3);
                    }
/* 208 */           map.put("blocking.intent", hashSet3);
/* 213 */           ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
/* 219 */           HashSet hashSet4 = new HashSet();
/* 222 */           if (integerArrayList4 != null) {
/* 224 */               hashSet4.addAll(integerArrayList4);
                    }
/* 227 */           map.put("nonblocking.intent", hashSet4);
/* 239 */           taskCompletionSource.trySetResult(new C1885lc(i2, i3, j, jM6527a, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4));
                }
            }
