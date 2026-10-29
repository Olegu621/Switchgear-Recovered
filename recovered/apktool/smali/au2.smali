.class public final synthetic Lau2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ldu2;

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/UCControllerId;

.field public final synthetic c:Lcom/usercentrics/sdk/ui/components/UCImageView;


# direct methods
.method public synthetic constructor <init>(Ldu2;Lcom/usercentrics/sdk/ui/components/UCControllerId;Lcom/usercentrics/sdk/ui/components/UCImageView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lau2;->a:Ldu2;

    .line 5
    .line 6
    iput-object p2, p0, Lau2;->b:Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 7
    .line 8
    iput-object p3, p0, Lau2;->c:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lau2;->b:Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 2
    .line 3
    iget-object v0, p0, Lau2;->c:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 4
    .line 5
    iget-object p0, p0, Lau2;->a:Ldu2;

    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Lcom/usercentrics/sdk/ui/components/UCControllerId;->j(Ldu2;Lcom/usercentrics/sdk/ui/components/UCControllerId;Lcom/usercentrics/sdk/ui/components/UCImageView;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
