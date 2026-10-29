            package p000;

            import android.content.Context;
            import com.supercell.p007id.scid_plugin.PlatformInterfacePlugin;
            import io.flutter.plugin.common.MethodChannel;
            import java.io.File;
            import java.io.IOException;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class rs1 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16280a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16281b;

                public /* synthetic */ rs1(Object obj, int i) {
/* 1 */             this.f16280a = i;
/* 3 */             this.f16281b = obj;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws an2 {
/* 1 */             int i = this.f16280a;
/* 3 */             Object obj3 = this.f16281b;
                    switch (i) {
                        case 0:
/* 1 */                     return PlatformInterfacePlugin.handlePutString$lambda$4((MethodChannel.Result) obj3, (Context) obj, (Unit) obj2);
                        case 1:
/* 1 */                     return PlatformInterfacePlugin.handlePutString$lambda$5((MethodChannel.Result) obj3, (Context) obj, (Exception) obj2);
                        case 2:
/* 1 */                     return PlatformInterfacePlugin.handleGetSharedAccountKeys$lambda$1((MethodChannel.Result) obj3, (Context) obj, (List) obj2);
                        case 3:
/* 1 */                     return PlatformInterfacePlugin.handleGetSharedAccountKeys$lambda$2((MethodChannel.Result) obj3, (Context) obj, (Exception) obj2);
                        case 4:
/* 1 */                     return PlatformInterfacePlugin.handleGetString$lambda$7((MethodChannel.Result) obj3, (Context) obj, (String) obj2);
                        case 5:
/* 1 */                     return PlatformInterfacePlugin.handleGetString$lambda$8((MethodChannel.Result) obj3, (Context) obj, (Exception) obj2);
                        default:
/* 11 */                    File file = (File) obj;
/* 13 */                    IOException iOException = (IOException) obj2;
/* 15 */                    file.getClass();
/* 18 */                    iOException.getClass();
/* 27 */                    if (((Function2) obj3).invoke(file, iOException) != yp1.f19743a) {
/* 29 */                        return Unit.f12910a;
                            }
/* 41 */                    throw new an2(file, null, null, 6, null);
                    }
                }
            }
