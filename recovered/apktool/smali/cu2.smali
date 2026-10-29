.class public final Lcu2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/UCControllerId;


# direct methods
.method public synthetic constructor <init>(Lcom/usercentrics/sdk/ui/components/UCControllerId;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcu2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcu2;->b:Lcom/usercentrics/sdk/ui/components/UCControllerId;

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
    iget v0, p0, Lcu2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lcu2;->b:Lcom/usercentrics/sdk/ui/components/UCControllerId;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucControllerIdValue:I

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
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucControllerIdLabel:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCTextView;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    sget v0, Lcom/usercentrics/sdk/ui/R$id;->ucControllerIdCopy:I

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    sget v0, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_copy:I

    .line 43
    .line 44
    invoke-static {p0, v0}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    sget v0, Lcom/usercentrics/sdk/ui/R$drawable;->uc_ic_check_circle_outline:I

    .line 57
    .line 58
    invoke-static {p0, v0}, Lmn0;->p(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
