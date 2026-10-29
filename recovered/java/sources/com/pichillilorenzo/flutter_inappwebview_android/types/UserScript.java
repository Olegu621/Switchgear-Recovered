            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class UserScript {
                static final /* synthetic */ boolean $assertionsDisabled = false;
                private Set<String> allowedOriginRules;
                private ContentWorld contentWorld;
                private String groupName;
                private UserScriptInjectionTime injectionTime;
                private String source;

                public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, Set<String> set) {
/* 9 */             this.allowedOriginRules = new HashSet();
/* 11 */            this.groupName = str;
/* 13 */            this.source = str2;
/* 15 */            this.injectionTime = userScriptInjectionTime;
/* 21 */            this.contentWorld = contentWorld == null ? ContentWorld.PAGE : contentWorld;
/* 30 */            this.allowedOriginRules = set == null ? new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserScript.1
                        {
/* 8 */                     add("*");
                        }
                    } : set;
                }

                public static UserScript fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 66 */            return new UserScript((String) map.get("groupName"), (String) map.get(FirebaseAnalytics.Param.SOURCE), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            UserScript userScript = (UserScript) obj;
/* 21 */            String str = this.groupName;
/* 23 */            String str2 = userScript.groupName;
/* 25 */            if (str == null ? str2 != null : !str.equals(str2)) {
/* 5 */                 return false;
                    }
/* 45 */            if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld)) {
/* 70 */                return this.allowedOriginRules.equals(userScript.allowedOriginRules);
                    }
/* 5 */             return false;
                }

                public Set<String> getAllowedOriginRules() {
/* 1 */             return this.allowedOriginRules;
                }

                public ContentWorld getContentWorld() {
/* 1 */             return this.contentWorld;
                }

                public String getGroupName() {
/* 1 */             return this.groupName;
                }

                public UserScriptInjectionTime getInjectionTime() {
/* 1 */             return this.injectionTime;
                }

                public String getSource() {
/* 1 */             return this.source;
                }

                public int hashCode() {
/* 1 */             String str = this.groupName;
/* 42 */            return this.allowedOriginRules.hashCode() + ((this.contentWorld.hashCode() + ((this.injectionTime.hashCode() + pm2.m7485h((str != null ? str.hashCode() : 0) * 31, 31, this.source)) * 31)) * 31);
                }

                public void setAllowedOriginRules(Set<String> set) {
/* 1 */             this.allowedOriginRules = set;
                }

                public void setContentWorld(ContentWorld contentWorld) {
/* 1 */             if (contentWorld == null) {
/* 3 */                 contentWorld = ContentWorld.PAGE;
                    }
/* 5 */             this.contentWorld = contentWorld;
                }

                public void setGroupName(String str) {
/* 1 */             this.groupName = str;
                }

                public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
/* 1 */             this.injectionTime = userScriptInjectionTime;
                }

                public void setSource(String str) {
/* 1 */             this.source = str;
                }

                public String toString() {
/* 58 */            return "UserScript{groupName='" + this.groupName + "', source='" + this.source + "', injectionTime=" + this.injectionTime + ", contentWorld=" + this.contentWorld + ", allowedOriginRules=" + this.allowedOriginRules + '}';
                }
            }
