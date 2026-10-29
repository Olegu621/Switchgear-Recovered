.class public final Lnt2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

.field public final synthetic b:Lew2;

.field public final synthetic c:Lst2;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/usercentrics/sdk/ui/components/cards/UCCard;Lew2;Lst2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnt2;->a:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 2
    .line 3
    iput-object p2, p0, Lnt2;->b:Lew2;

    .line 4
    .line 5
    iput-object p3, p0, Lnt2;->c:Lst2;

    .line 6
    .line 7
    iput-object p4, p0, Lnt2;->d:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    sget v0, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->e0:I

    .line 8
    .line 9
    iget-object v0, p0, Lnt2;->a:Lcom/usercentrics/sdk/ui/components/cards/UCCard;

    .line 10
    .line 11
    iget-object v1, p0, Lnt2;->b:Lew2;

    .line 12
    .line 13
    iget-object v2, p0, Lnt2;->c:Lst2;

    .line 14
    .line 15
    iget-object p0, p0, Lnt2;->d:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, p0}, Lcom/usercentrics/sdk/ui/components/cards/UCCard;->f(Lew2;Lst2;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    new-instance p0, Lmt2;

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-direct {p0, v0, p1}, Lmt2;-><init>(Lcom/usercentrics/sdk/ui/components/cards/UCCard;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
