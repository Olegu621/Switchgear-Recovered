            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 19 */    public abstract class ty1 extends AbstractC2075pm implements u21 {

                /* JADX INFO: renamed from: a */
                public final boolean f17303a;

                public ty1(Object obj, Class cls, String str, String str2, int i) {
/* 15 */            super(obj, cls, str, str2, (i & 1) == 1);
/* 18 */            this.f17303a = false;
                }

                @Override // p000.AbstractC2075pm
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final u21 getReflected() {
/* 3 */             if (!this.f17303a) {
/* 9 */                 return (u21) super.getReflected();
                    }
/* 14 */            C1951n4.m6866q("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
/* 17 */            return null;
                }

                @Override // p000.AbstractC2075pm
                public final n21 compute() {
                    return this.f17303a ? this : super.compute();
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof ty1) {
/* 10 */                ty1 ty1Var = (ty1) obj;
                        return getOwner().equals(ty1Var.getOwner()) && getName().equals(ty1Var.getName()) && getSignature().equals(ty1Var.getSignature()) && Intrinsics.m6216a(getBoundReceiver(), ty1Var.getBoundReceiver());
                    }
/* 72 */            if (obj instanceof u21) {
/* 78 */                return obj.equals(compute());
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 30 */            return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
                }

                public final String toString() {
/* 1 */             n21 n21VarCompute = compute();
/* 5 */             if (n21VarCompute != this) {
/* 7 */                 return n21VarCompute.toString();
                    }
/* 31 */            return "property " + getName() + " (Kotlin reflection is not available)";
                }

/* 20 */        public ty1() {
/* 22 */            this.f17303a = false;
                }
            }
