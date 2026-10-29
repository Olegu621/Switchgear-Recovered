.class public final Lct2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/UCButton;


# direct methods
.method public synthetic constructor <init>(Lcom/usercentrics/sdk/ui/components/UCButton;I)V
    .locals 0

    .line 1
    iput p2, p0, Lct2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lct2;->b:Lcom/usercentrics/sdk/ui/components/UCButton;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lct2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lct2;->b:Lcom/usercentrics/sdk/ui/components/UCButton;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucButtonText:I

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucButtonBackground:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
