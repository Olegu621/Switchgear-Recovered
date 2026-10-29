            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import com.pichillilorenzo.flutter_inappwebview_android.Util;
            import java.util.Map;
            import java.util.Objects;
            import p000.pm2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppBrowserMenuItem {
                private Object icon;
                private String iconColor;

                /* JADX INFO: renamed from: id */
                private int f5331id;
                private Integer order;
                private boolean showAsAction;
                private String title;

                public InAppBrowserMenuItem(int i, String str, Integer num, Object obj, String str2, boolean z) {
/* 4 */             this.f5331id = i;
/* 6 */             this.title = str;
/* 8 */             this.order = num;
/* 10 */            this.icon = obj;
/* 12 */            this.iconColor = str2;
/* 14 */            this.showAsAction = z;
                }

                public static InAppBrowserMenuItem fromMap(Map<String, Object> map) {
                    Object obj;
/* 1 */             AndroidResource androidResourceFromMap = null;
/* 2 */             if (map == null) {
/* 1 */                 return null;
                    }
/* 13 */            int iIntValue = ((Integer) map.get("id")).intValue();
/* 24 */            String str = (String) map.get("title");
/* 33 */            Integer num = (Integer) map.get("order");
/* 37 */            Object obj2 = map.get("icon");
/* 43 */            if (!(obj2 instanceof Map)) {
/* 59 */                if (obj2 instanceof byte[]) {
/* 62 */                    obj = obj2;
                        }
/* 88 */                return new InAppBrowserMenuItem(iIntValue, str, num, obj, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
                    }
/* 51 */            androidResourceFromMap = AndroidResource.fromMap((Map) map.get("icon"));
/* 55 */            obj = androidResourceFromMap;
/* 88 */            return new InAppBrowserMenuItem(iIntValue, str, num, obj, (String) map.get("iconColor"), ((Boolean) Util.getOrDefault(map, "showAsAction", Boolean.FALSE)).booleanValue());
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            InAppBrowserMenuItem inAppBrowserMenuItem = (InAppBrowserMenuItem) obj;
/* 25 */            if (this.f5331id == inAppBrowserMenuItem.f5331id && this.showAsAction == inAppBrowserMenuItem.showAsAction && this.title.equals(inAppBrowserMenuItem.title) && Objects.equals(this.order, inAppBrowserMenuItem.order) && Objects.equals(this.icon, inAppBrowserMenuItem.icon)) {
/* 72 */                return Objects.equals(this.iconColor, inAppBrowserMenuItem.iconColor);
                    }
/* 5 */             return false;
                }

                public Object getIcon() {
/* 1 */             return this.icon;
                }

                public String getIconColor() {
/* 1 */             return this.iconColor;
                }

                public int getId() {
/* 1 */             return this.f5331id;
                }

                public Integer getOrder() {
/* 1 */             return this.order;
                }

                public String getTitle() {
/* 1 */             return this.title;
                }

                public int hashCode() {
/* 8 */             int iM7485h = pm2.m7485h(this.f5331id * 31, 31, this.title);
/* 12 */            Integer num = this.order;
/* 24 */            int iHashCode = (iM7485h + (num != null ? num.hashCode() : 0)) * 31;
/* 25 */            Object obj = this.icon;
/* 36 */            int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
/* 37 */            String str = this.iconColor;
/* 49 */            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.showAsAction ? 1 : 0);
                }

                public boolean isShowAsAction() {
/* 1 */             return this.showAsAction;
                }

                public void setIcon(Object obj) {
/* 1 */             this.icon = obj;
                }

                public void setIconColor(String str) {
/* 1 */             this.iconColor = str;
                }

                public void setId(int i) {
/* 1 */             this.f5331id = i;
                }

                public void setOrder(Integer num) {
/* 1 */             this.order = num;
                }

                public void setShowAsAction(boolean z) {
/* 1 */             this.showAsAction = z;
                }

                public void setTitle(String str) {
/* 1 */             this.title = str;
                }

                public String toString() {
/* 68 */            return "InAppBrowserMenuItem{id=" + this.f5331id + ", title='" + this.title + "', order=" + this.order + ", icon=" + this.icon + ", iconColor='" + this.iconColor + "', showAsAction=" + this.showAsAction + '}';
                }
            }
