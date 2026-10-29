            package p000;

            import com.supercell.p007id.scid_plugin.PlatformInterfacePlugin;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataManager;
            import kotlin.jvm.functions.Function0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final /* synthetic */ class qs1 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15727a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f15728b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f15729c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15730d;

                public /* synthetic */ qs1(SharedDataManager sharedDataManager, String str, String str2) {
/* 7 */             this.f15730d = sharedDataManager;
/* 9 */             this.f15728b = str;
/* 11 */            this.f15729c = str2;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f15727a;
/* 3 */             String str = this.f15729c;
/* 5 */             String str2 = this.f15728b;
/* 7 */             Object obj = this.f15730d;
                    switch (i) {
                        case 0:
/* 1 */                     return PlatformInterfacePlugin.handlePutString$lambda$3(str2, str, (PlatformInterfacePlugin) obj);
                        default:
/* 1 */                     return SharedDataManager.getAccountsFromGame$lambda$0((SharedDataManager) obj, str2, str);
                    }
                }

/* 13 */        public /* synthetic */ qs1(String str, String str2, PlatformInterfacePlugin platformInterfacePlugin) {
                    this.f15728b = str;
                    this.f15729c = str2;
                    this.f15730d = platformInterfacePlugin;
                }
            }
