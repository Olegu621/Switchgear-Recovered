            package p000;

            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Proxy;
            import java.util.Objects;
            import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
            import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class h63 implements WebMessageBoundaryInterface {

                /* JADX INFO: renamed from: b */
                public static final String[] f8938b = {"WEB_MESSAGE_ARRAY_BUFFER"};

                /* JADX INFO: renamed from: a */
                public final i63 f8939a;

                public h63(i63 i63Var) {
/* 4 */             this.f8939a = i63Var;
                }

                /* JADX INFO: renamed from: a */
                public static i63 m4118a(WebMessageBoundaryInterface webMessageBoundaryInterface) {
/* 1 */             InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
/* 6 */             l63[] l63VarArr = new l63[ports.length];
/* 10 */            for (int i = 0; i < ports.length; i++) {
/* 19 */                l63VarArr[i] = new m63(ports[i]);
                    }
/* 30 */            if (!b73.f2320u.mo97b()) {
/* 81 */                return new i63(webMessageBoundaryInterface.getData(), l63VarArr);
                    }
/* 42 */            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) j13.m5642b(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
/* 44 */            int type = webMessagePayloadBoundaryInterface.getType();
/* 48 */            if (type == 0) {
/* 71 */                return new i63(webMessagePayloadBoundaryInterface.getAsString(), l63VarArr);
                    }
/* 51 */            if (type != 1) {
/* 53 */                return null;
                    }
/* 61 */            return new i63(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), l63VarArr);
                }

                @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
                public final String getData() {
/* 2 */             i63 i63Var = this.f8939a;
/* 4 */             i63Var.m4482a(0);
/* 7 */             return i63Var.f9473b;
                }

                @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
                public final InvocationHandler getMessagePayload() {
                    j63 j63Var;
/* 1 */             i63 i63Var = this.f8939a;
/* 3 */             int i = i63Var.f9475d;
/* 5 */             if (i == 0) {
/* 47 */                i63Var.m4482a(0);
/* 52 */                j63Var = new j63(i63Var.f9473b);
                    } else {
/* 8 */                 if (i != 1) {
/* 43 */                    throw new IllegalStateException("Unknown web message payload type: " + i);
                        }
/* 12 */                i63Var.m4482a(1);
/* 15 */                byte[] bArr = i63Var.f9474c;
/* 17 */                Objects.requireNonNull(bArr);
/* 20 */                j63Var = new j63(bArr);
                    }
/* 57 */            return new C2297vk(j63Var);
                }

                @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
                public final InvocationHandler[] getPorts() {
/* 3 */             l63[] l63VarArr = this.f8939a.f9472a;
/* 5 */             if (l63VarArr == null) {
/* 7 */                 return null;
                    }
/* 10 */            InvocationHandler[] invocationHandlerArr = new InvocationHandler[l63VarArr.length];
/* 14 */            for (int i = 0; i < l63VarArr.length; i++) {
/* 28 */                invocationHandlerArr[i] = Proxy.getInvocationHandler(((m63) l63VarArr[i]).m6610b());
                    }
/* 33 */            return invocationHandlerArr;
                }

                @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
                public final String[] getSupportedFeatures() {
/* 1 */             return f8938b;
                }
            }
