            package p000;

            import com.supercell.p007id.FlutterSupport;
            import io.flutter.plugin.common.BinaryMessenger;
            import java.nio.ByteBuffer;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class xk0 implements BinaryMessenger.BinaryMessageHandler {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19236a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Long f19237b;

                public /* synthetic */ xk0(Long l, int i) {
/* 1 */             this.f19236a = i;
/* 3 */             this.f19237b = l;
                }

                @Override // io.flutter.plugin.common.BinaryMessenger.BinaryMessageHandler
                public final void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
/* 1 */             int i = this.f19236a;
/* 3 */             Long l = this.f19237b;
                    switch (i) {
                        case 0:
/* 1 */                     FlutterSupport.lambda$applyPendingHandlers$1(l, byteBuffer, binaryReply);
                            break;
                        default:
/* 1 */                     FlutterSupport.lambda$setMessageHandler$4(l, byteBuffer, binaryReply);
                            break;
                    }
                }
            }
