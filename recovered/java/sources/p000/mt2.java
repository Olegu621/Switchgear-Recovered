            package p000;

            import com.usercentrics.sdk.p008ui.components.cards.UCCard;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class mt2 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14024a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UCCard f14025b;

                public /* synthetic */ mt2(UCCard uCCard, int i) {
/* 1 */             this.f14024a = i;
/* 3 */             this.f14025b = uCCard;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f14024a;
/* 3 */             UCCard uCCard = this.f14025b;
                    switch (i) {
                        case 0:
/* 39 */                    UCCard.m2801a(uCCard);
                            break;
                        default:
/* 9 */                     int[] iArr = {0, 0};
/* 13 */                    uCCard.getLocationOnScreen(iArr);
/* 35 */                    uCCard.getOnExpandedListener().invoke(Integer.valueOf(iArr[1]), Integer.valueOf(uCCard.getHeight()));
                            break;
                    }
                }
            }
