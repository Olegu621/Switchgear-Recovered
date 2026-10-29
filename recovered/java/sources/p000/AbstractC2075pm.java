            package p000;

            import java.io.Serializable;
            import java.lang.annotation.Annotation;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: renamed from: pm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 13 */    public abstract class AbstractC2075pm implements n21, Serializable {
                public static final Object NO_RECEIVER = C2038om.f14815a;
                private final boolean isTopLevel;
                private final String name;
                private final Class owner;
                protected final Object receiver;
                private transient n21 reflected;
                private final String signature;

                public AbstractC2075pm(Object obj, Class cls, String str, String str2, boolean z) {
/* 4 */             this.receiver = obj;
/* 6 */             this.owner = cls;
/* 8 */             this.name = str;
/* 10 */            this.signature = str2;
/* 12 */            this.isTopLevel = z;
                }

                @Override // p000.n21
                public Object call(Object... objArr) {
/* 5 */             return getReflected().call(objArr);
                }

                @Override // p000.n21
                public Object callBy(Map map) {
/* 5 */             return getReflected().callBy(map);
                }

                public n21 compute() {
/* 1 */             n21 n21Var = this.reflected;
/* 3 */             if (n21Var != null) {
/* 11 */                return n21Var;
                    }
/* 5 */             n21 n21VarComputeReflected = computeReflected();
/* 9 */             this.reflected = n21VarComputeReflected;
/* 11 */            return n21VarComputeReflected;
                }

                public abstract n21 computeReflected();

                @Override // p000.m21
                public List<Annotation> getAnnotations() {
/* 5 */             return getReflected().getAnnotations();
                }

                public Object getBoundReceiver() {
/* 1 */             return this.receiver;
                }

                @Override // p000.n21
                public String getName() {
/* 1 */             return this.name;
                }

                public p21 getOwner() {
/* 1 */             Class cls = this.owner;
/* 3 */             if (cls == null) {
/* 5 */                 return null;
                    }
/* 9 */             if (!this.isTopLevel) {
/* 22 */                return j22.m5667a(cls);
                    }
/* 13 */            j22.f12033a.getClass();
/* 18 */            return new xq1(cls);
                }

                @Override // p000.n21
                public List<Object> getParameters() {
/* 5 */             return getReflected().getParameters();
                }

                public n21 getReflected() {
/* 1 */             n21 n21VarCompute = compute();
/* 5 */             if (n21VarCompute != this) {
/* 7 */                 return n21VarCompute;
                    }
/* 13 */            throw new x41();
                }

                @Override // p000.n21
                public v21 getReturnType() {
/* 5 */             return getReflected().getReturnType();
                }

                public String getSignature() {
/* 1 */             return this.signature;
                }

                @Override // p000.n21
                public List<Object> getTypeParameters() {
/* 5 */             return getReflected().getTypeParameters();
                }

                @Override // p000.n21
                public z21 getVisibility() {
/* 5 */             return getReflected().getVisibility();
                }

                @Override // p000.n21
                public boolean isAbstract() {
/* 5 */             return getReflected().isAbstract();
                }

                @Override // p000.n21
                public boolean isFinal() {
/* 5 */             return getReflected().isFinal();
                }

                @Override // p000.n21
                public boolean isOpen() {
/* 5 */             return getReflected().isOpen();
                }

/* 14 */        public AbstractC2075pm() {
/* 16 */            this(NO_RECEIVER, null, null, null, false);
                }
            }
