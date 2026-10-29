            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.HashMap;
            import java.util.Map;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FindSession {
                private int highlightedResultIndex;
                private int resultCount;
                private int searchResultDisplayStyle = 2;

                public FindSession(int i, int i2) {
/* 7 */             this.resultCount = i;
/* 9 */             this.highlightedResultIndex = i2;
                }

                public boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                FindSession findSession = (FindSession) obj;
/* 25 */                if (this.resultCount == findSession.resultCount && this.highlightedResultIndex == findSession.highlightedResultIndex && this.searchResultDisplayStyle == findSession.searchResultDisplayStyle) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public int getHighlightedResultIndex() {
/* 1 */             return this.highlightedResultIndex;
                }

                public int getResultCount() {
/* 1 */             return this.resultCount;
                }

                public int getSearchResultDisplayStyle() {
/* 1 */             return this.searchResultDisplayStyle;
                }

                public int hashCode() {
/* 12 */            return (((this.resultCount * 31) + this.highlightedResultIndex) * 31) + this.searchResultDisplayStyle;
                }

                public void setHighlightedResultIndex(int i) {
/* 1 */             this.highlightedResultIndex = i;
                }

                public void setResultCount(int i) {
/* 1 */             this.resultCount = i;
                }

                public void setSearchResultDisplayStyle(int i) {
/* 1 */             this.searchResultDisplayStyle = i;
                }

                public Map<String, Object> toMap() {
/* 3 */             HashMap map = new HashMap();
/* 14 */            map.put("resultCount", Integer.valueOf(this.resultCount));
/* 25 */            map.put("highlightedResultIndex", Integer.valueOf(this.highlightedResultIndex));
/* 36 */            map.put("searchResultDisplayStyle", Integer.valueOf(this.searchResultDisplayStyle));
/* 39 */            return map;
                }

                public String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("FindSession{resultCount=");
/* 10 */            sb.append(this.resultCount);
/* 15 */            sb.append(", highlightedResultIndex=");
/* 20 */            sb.append(this.highlightedResultIndex);
/* 25 */            sb.append(", searchResultDisplayStyle=");
/* 32 */            return AbstractC0886en.m3510n(sb, this.searchResultDisplayStyle, '}');
                }
            }
