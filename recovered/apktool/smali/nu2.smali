.class public final synthetic Lnu2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lsu2;

.field public final synthetic b:Landroidx/appcompat/widget/LinearLayoutCompat;

.field public final synthetic c:Lcom/usercentrics/sdk/ui/components/UCTextView;

.field public final synthetic d:Lcom/usercentrics/sdk/ui/components/UCTextView;


# direct methods
.method public synthetic constructor <init>(Lsu2;Landroidx/appcompat/widget/LinearLayoutCompat;Lcom/usercentrics/sdk/ui/components/UCTextView;Lcom/usercentrics/sdk/ui/components/UCTextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnu2;->a:Lsu2;

    .line 5
    .line 6
    iput-object p2, p0, Lnu2;->b:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 7
    .line 8
    iput-object p3, p0, Lnu2;->c:Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 9
    .line 10
    iput-object p4, p0, Lnu2;->d:Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 p1, 0x1

    .line 2
    iget-object v2, p0, Lnu2;->a:Lsu2;

    .line 3
    .line 4
    iput-boolean p1, v2, Lsu2;->t:Z

    .line 5
    .line 6
    iget-object p1, p0, Lnu2;->b:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 7
    .line 8
    iget-object v0, p0, Lnu2;->c:Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lsu2;->a()Lmu2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p1, p1, Lmu2;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {v2}, Lsu2;->a()Lmu2;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v0, Ln01;

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x3

    .line 30
    const/4 v1, 0x1

    .line 31
    const-class v3, Lsu2;

    .line 32
    .line 33
    const-string v4, "onHtmlLinkClick"

    .line 34
    .line 35
    const-string v5, "onHtmlLinkClick(Lcom/usercentrics/sdk/models/settings/PredefinedUIHtmlLinkType;)V"

    .line 36
    .line 37
    invoke-direct/range {v0 .. v7}, Ln01;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lnu2;->d:Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Lcom/usercentrics/sdk/ui/components/UCTextView;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lou2;->a(Lsu2;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
