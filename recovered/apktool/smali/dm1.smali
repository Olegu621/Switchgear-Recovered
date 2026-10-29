.class public final Ldm1;
.super Lc22;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic f:Lgm1;


# direct methods
.method public constructor <init>(Lgm1;Lcom/google/android/material/internal/NavigationMenuView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldm1;->f:Lgm1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lc22;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Lf1;)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lc22;->d(Landroid/view/View;Lf1;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldm1;->f:Lgm1;

    .line 5
    .line 6
    iget-object p0, p0, Lgm1;->e:Lyl1;

    .line 7
    .line 8
    iget-object p0, p0, Lyl1;->g:Lgm1;

    .line 9
    .line 10
    iget-object p1, p0, Lgm1;->b:Landroid/widget/LinearLayout;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    move p1, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    :goto_0
    move v1, v0

    .line 23
    :goto_1
    iget-object v2, p0, Lgm1;->e:Lyl1;

    .line 24
    .line 25
    iget-object v2, v2, Lyl1;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-ge v1, v2, :cond_2

    .line 32
    .line 33
    iget-object v2, p0, Lgm1;->e:Lyl1;

    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lyl1;->c(I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    add-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {p1, v0, v0}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;->obtain(IIZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    iget-object p1, p2, Lf1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 51
    .line 52
    invoke-virtual {p1, p0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
