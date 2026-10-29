.class public final Leu2;
.super Landroidx/recyclerview/widget/o;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final u:Lcom/usercentrics/sdk/ui/components/UCControllerId;


# direct methods
.method public constructor <init>(Lew2;Lcom/usercentrics/sdk/ui/components/UCControllerId;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/o;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Leu2;->u:Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->m(Lew2;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    sget p1, Lcom/usercentrics/sdk/ui/R$dimen;->ucControllerIdHorizontalMargin:I

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    float-to-int p0, p0

    .line 23
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    sget v0, Lcom/usercentrics/sdk/ui/R$dimen;->ucControllerIdVerticalMargin:I

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    float-to-int p1, p1

    .line 34
    const/4 v0, 0x1

    .line 35
    invoke-static {p2, p0, p1, v0}, Lk33;->a(Landroid/view/ViewGroup;IIZ)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
