            package p000;

            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import com.usercentrics.sdk.UsercentricsReadyStatus;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class s03 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ UsercentricsSDK f16375a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UsercentricsReadyStatus f16376b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ TCFData f16377c;

                public /* synthetic */ s03(UsercentricsSDK usercentricsSDK, UsercentricsReadyStatus usercentricsReadyStatus, TCFData tCFData) {
/* 4 */             this.f16375a = usercentricsSDK;
/* 6 */             this.f16376b = usercentricsReadyStatus;
/* 8 */             this.f16377c = tCFData;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
/* 1 */             return UsercentricsSDK.showDialog$lambda$6$lambda$5$lambda$4$lambda$3(this.f16375a, this.f16376b, this.f16377c, (nz2) obj);
                }
            }
