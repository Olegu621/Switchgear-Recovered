            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.Arrays;
            import java.util.Map;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class CustomTabsActionButton {
                private String description;
                private byte[] icon;

                /* JADX INFO: renamed from: id */
                private int f5329id;
                private boolean shouldTint;

                public CustomTabsActionButton(int i, byte[] bArr, String str, boolean z) {
/* 4 */             this.f5329id = i;
/* 6 */             this.icon = bArr;
/* 8 */             this.description = str;
/* 10 */            this.shouldTint = z;
                }

                public static CustomTabsActionButton fromMap(Map<String, Object> map) {
/* 1 */             if (map == null) {
/* 3 */                 return null;
                    }
/* 47 */            return new CustomTabsActionButton(((Integer) map.get("id")).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
/* 25 */            if (this.f5329id == customTabsActionButton.f5329id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
/* 50 */                return this.description.equals(customTabsActionButton.description);
                    }
/* 5 */             return false;
                }

                public String getDescription() {
/* 1 */             return this.description;
                }

                public byte[] getIcon() {
/* 1 */             return this.icon;
                }

                public int getId() {
/* 1 */             return this.f5329id;
                }

                public int hashCode() {
/* 22 */            return pm2.m7485h((Arrays.hashCode(this.icon) + (this.f5329id * 31)) * 31, 31, this.description) + (this.shouldTint ? 1 : 0);
                }

                public boolean isShouldTint() {
/* 1 */             return this.shouldTint;
                }

                public void setDescription(String str) {
/* 1 */             this.description = str;
                }

                public void setIcon(byte[] bArr) {
/* 1 */             this.icon = bArr;
                }

                public void setId(int i) {
/* 1 */             this.f5329id = i;
                }

                public void setShouldTint(boolean z) {
/* 1 */             this.shouldTint = z;
                }

                public String toString() {
/* 52 */            return "CustomTabsActionButton{id=" + this.f5329id + ", icon=" + Arrays.toString(this.icon) + ", description='" + this.description + "', shouldTint=" + this.shouldTint + '}';
                }
            }
