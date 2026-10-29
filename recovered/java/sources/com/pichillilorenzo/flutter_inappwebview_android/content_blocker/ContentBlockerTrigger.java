            package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ContentBlockerTrigger {
                private List<String> ifDomain;
                private List<String> ifTopUrl;
                private List<String> loadType;
                private List<ContentBlockerTriggerResourceType> resourceType;
                private List<String> unlessDomain;
                private List<String> unlessTopUrl;
                private String urlFilter;
                private Boolean urlFilterIsCaseSensitive;
                private Pattern urlFilterPatternCompiled;

                public ContentBlockerTrigger(String str, Boolean bool, List<ContentBlockerTriggerResourceType> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, List<String> list6) {
/* 9 */             this.resourceType = new ArrayList();
/* 16 */            this.ifDomain = new ArrayList();
/* 23 */            this.unlessDomain = new ArrayList();
/* 30 */            this.loadType = new ArrayList();
/* 37 */            this.ifTopUrl = new ArrayList();
/* 44 */            this.unlessTopUrl = new ArrayList();
/* 54 */            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
/* 59 */            this.urlFilterIsCaseSensitive = Boolean.valueOf(zBooleanValue);
/* 61 */            this.urlFilter = str;
/* 72 */            this.urlFilterPatternCompiled = Pattern.compile(str, zBooleanValue ? 0 : 2);
/* 79 */            this.resourceType = list == null ? this.resourceType : list;
/* 84 */            list2 = list2 == null ? this.ifDomain : list2;
/* 86 */            this.ifDomain = list2;
/* 93 */            this.unlessDomain = list3 == null ? this.unlessDomain : list3;
/* 99 */            if (!list2.isEmpty() && !this.unlessDomain.isEmpty()) {
/* 115 */               throw new AssertionError();
                    }
/* 119 */           list4 = list4 == null ? this.loadType : list4;
/* 121 */           this.loadType = list4;
/* 127 */           if (list4.size() > 2) {
/* 170 */               throw new AssertionError();
                    }
/* 132 */           list5 = list5 == null ? this.ifTopUrl : list5;
/* 134 */           this.ifTopUrl = list5;
/* 141 */           this.unlessTopUrl = list6 == null ? this.unlessTopUrl : list6;
/* 147 */           if (!list5.isEmpty() && !this.unlessTopUrl.isEmpty()) {
/* 163 */               throw new AssertionError();
                    }
                }

                public static ContentBlockerTrigger fromMap(Map<String, Object> map) {
/* 8 */             String str = (String) map.get("url-filter");
/* 17 */            Boolean bool = (Boolean) map.get("url-filter-is-case-sensitive");
/* 25 */            List list = (List) map.get("resource-type");
/* 29 */            ArrayList arrayList = new ArrayList();
/* 32 */            if (list != null) {
/* 34 */                Iterator it = list.iterator();
/* 42 */                while (it.hasNext()) {
/* 54 */                    arrayList.add(ContentBlockerTriggerResourceType.fromValue((String) it.next()));
                        }
                    } else {
/* 66 */                arrayList.addAll(Arrays.asList(ContentBlockerTriggerResourceType.values()));
                    }
/* 116 */           return new ContentBlockerTrigger(str, bool, arrayList, (List) map.get("if-domain"), (List) map.get("unless-domain"), (List) map.get("load-type"), (List) map.get("if-top-url"), (List) map.get("unless-top-url"));
                }

                public boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 19 */            ContentBlockerTrigger contentBlockerTrigger = (ContentBlockerTrigger) obj;
/* 29 */            if (this.urlFilter.equals(contentBlockerTrigger.urlFilter) && this.urlFilterPatternCompiled.equals(contentBlockerTrigger.urlFilterPatternCompiled) && this.urlFilterIsCaseSensitive.equals(contentBlockerTrigger.urlFilterIsCaseSensitive) && this.resourceType.equals(contentBlockerTrigger.resourceType) && this.ifDomain.equals(contentBlockerTrigger.ifDomain) && this.unlessDomain.equals(contentBlockerTrigger.unlessDomain) && this.loadType.equals(contentBlockerTrigger.loadType) && this.ifTopUrl.equals(contentBlockerTrigger.ifTopUrl)) {
/* 113 */               return this.unlessTopUrl.equals(contentBlockerTrigger.unlessTopUrl);
                    }
/* 5 */             return false;
                }

                public List<String> getIfDomain() {
/* 1 */             return this.ifDomain;
                }

                public List<String> getIfTopUrl() {
/* 1 */             return this.ifTopUrl;
                }

                public List<String> getLoadType() {
/* 1 */             return this.loadType;
                }

                public List<ContentBlockerTriggerResourceType> getResourceType() {
/* 1 */             return this.resourceType;
                }

                public List<String> getUnlessDomain() {
/* 1 */             return this.unlessDomain;
                }

                public List<String> getUnlessTopUrl() {
/* 1 */             return this.unlessTopUrl;
                }

                public String getUrlFilter() {
/* 1 */             return this.urlFilter;
                }

                public Boolean getUrlFilterIsCaseSensitive() {
/* 1 */             return this.urlFilterIsCaseSensitive;
                }

                public Pattern getUrlFilterPatternCompiled() {
/* 1 */             return this.urlFilterPatternCompiled;
                }

                public int hashCode() {
/* 78 */            return this.unlessTopUrl.hashCode() + ((this.ifTopUrl.hashCode() + ((this.loadType.hashCode() + ((this.unlessDomain.hashCode() + ((this.ifDomain.hashCode() + ((this.resourceType.hashCode() + ((this.urlFilterIsCaseSensitive.hashCode() + ((this.urlFilterPatternCompiled.hashCode() + (this.urlFilter.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
                }

                public void setIfDomain(List<String> list) {
/* 1 */             this.ifDomain = list;
                }

                public void setIfTopUrl(List<String> list) {
/* 1 */             this.ifTopUrl = list;
                }

                public void setLoadType(List<String> list) {
/* 1 */             this.loadType = list;
                }

                public void setResourceType(List<ContentBlockerTriggerResourceType> list) {
/* 1 */             this.resourceType = list;
                }

                public void setUnlessDomain(List<String> list) {
/* 1 */             this.unlessDomain = list;
                }

                public void setUnlessTopUrl(List<String> list) {
/* 1 */             this.unlessTopUrl = list;
                }

                public void setUrlFilter(String str) {
/* 1 */             this.urlFilter = str;
                }

                public void setUrlFilterIsCaseSensitive(Boolean bool) {
/* 1 */             this.urlFilterIsCaseSensitive = bool;
                }

                public void setUrlFilterPatternCompiled(Pattern pattern) {
/* 1 */             this.urlFilterPatternCompiled = pattern;
                }

                public String toString() {
/* 98 */            return "ContentBlockerTrigger{urlFilter='" + this.urlFilter + "', urlFilterPatternCompiled=" + this.urlFilterPatternCompiled + ", urlFilterIsCaseSensitive=" + this.urlFilterIsCaseSensitive + ", resourceType=" + this.resourceType + ", ifDomain=" + this.ifDomain + ", unlessDomain=" + this.unlessDomain + ", loadType=" + this.loadType + ", ifTopUrl=" + this.ifTopUrl + ", unlessTopUrl=" + this.unlessTopUrl + '}';
                }
            }
