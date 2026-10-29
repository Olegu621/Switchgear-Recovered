            package p000;

            import com.google.android.gms.tasks.OnCompleteListener;
            import com.google.android.gms.tasks.Task;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class si1 implements OnCompleteListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ MethodChannel.Result f16646a;

                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task task) {
/* 1 */             task.getClass();
/* 14 */            this.f16646a.success(Boolean.valueOf(task.isSuccessful()));
                }
            }
