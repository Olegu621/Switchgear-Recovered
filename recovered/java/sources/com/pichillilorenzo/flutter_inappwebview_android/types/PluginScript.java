            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PluginScript extends UserScript {
                private boolean requiredInAllContentWorlds;

                public PluginScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, boolean z, Set<String> set) {
/* 7 */             super(str, str2, userScriptInjectionTime, contentWorld, set);
/* 10 */            this.requiredInAllContentWorlds = z;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.requiredInAllContentWorlds == ((PluginScript) obj).requiredInAllContentWorlds;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
                public int hashCode() {
/* 9 */             return (super.hashCode() * 31) + (this.requiredInAllContentWorlds ? 1 : 0);
                }

                public boolean isRequiredInAllContentWorlds() {
/* 1 */             return this.requiredInAllContentWorlds;
                }

                public void setRequiredInAllContentWorlds(boolean z) {
/* 1 */             this.requiredInAllContentWorlds = z;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
                public String toString() {
/* 25 */            return "PluginScript{requiredInContentWorld=" + this.requiredInAllContentWorlds + "} " + super.toString();
                }
            }
