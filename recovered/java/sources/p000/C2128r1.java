            package p000;

            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.games.PlayerRef;
            import com.google.android.gms.games.achievement.AchievementRef;
            import com.google.android.gms.games.event.EventRef;
            import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
            
            /* JADX INFO: renamed from: r1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C2128r1 extends AbstractC1775j {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f15829b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2128r1(DataHolder dataHolder, int i) {
/* 3 */             super(dataHolder);
/* 1 */             this.f15829b = i;
                }

                @Override // p000.AbstractC1775j
                public final Object get(int i) {
                    switch (this.f15829b) {
                        case 0:
/* 34 */                    return new AchievementRef(this.f11978a, i);
                        case 1:
/* 26 */                    return new EventRef(this.f11978a, i);
                        case 2:
/* 18 */                    return new PlayerRef(this.f11978a, i);
                        default:
/* 10 */                    return new SnapshotMetadataRef(this.f11978a, i);
                    }
                }
            }
