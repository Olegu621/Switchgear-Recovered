            package p000;

            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class uo0 extends AbstractC2075pm implements to0, q21 {
                private final int arity;
                private final int flags;

                public uo0(int i, Object obj, Class cls, String str, String str2, int i2) {
/* 15 */            super(obj, cls, str, str2, (i2 & 1) == 1);
/* 18 */            this.arity = i;
/* 20 */            this.flags = 0;
                }

                @Override // p000.AbstractC2075pm
                public n21 computeReflected() {
/* 3 */             j22.f12033a.getClass();
/* 6 */             return this;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof uo0) {
/* 10 */                uo0 uo0Var = (uo0) obj;
                        return getName().equals(uo0Var.getName()) && getSignature().equals(uo0Var.getSignature()) && this.flags == uo0Var.flags && this.arity == uo0Var.arity && Intrinsics.m6216a(getBoundReceiver(), uo0Var.getBoundReceiver()) && Intrinsics.m6216a(getOwner(), uo0Var.getOwner());
                    }
/* 84 */            if (obj instanceof q21) {
/* 90 */                return obj.equals(compute());
                    }
/* 7 */             return false;
                }

                @Override // p000.to0
                public int getArity() {
/* 1 */             return this.arity;
                }

                @Override // p000.AbstractC2075pm
                public q21 getReflected() {
/* 5 */             return (q21) super.getReflected();
                }

                public int hashCode() {
/* 38 */            return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
                }

                @Override // p000.q21
                public boolean isExternal() {
/* 5 */             return getReflected().isExternal();
                }

                @Override // p000.q21
                public boolean isInfix() {
/* 5 */             return getReflected().isInfix();
                }

                @Override // p000.q21
                public boolean isInline() {
/* 5 */             return getReflected().isInline();
                }

                @Override // p000.q21
                public boolean isOperator() {
/* 5 */             return getReflected().isOperator();
                }

                @Override // p000.q21
                public boolean isSuspend() {
/* 5 */             return getReflected().isSuspend();
                }

                public String toString() {
/* 1 */             n21 n21VarCompute = compute();
/* 5 */             if (n21VarCompute != this) {
/* 7 */                 return n21VarCompute.toString();
                    }
/* 22 */            if ("<init>".equals(getName())) {
/* 24 */                return "constructor (Kotlin reflection is not available)";
                    }
/* 46 */            return "function " + getName() + " (Kotlin reflection is not available)";
                }
            }
