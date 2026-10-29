.class public final Lyu2;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/usercentrics/sdk/ui/components/UCImageView;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/usercentrics/sdk/ui/components/UCImageView;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyu2;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lyu2;->b:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Ltj2;-><init>(ILc10;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 1

    .line 1
    new-instance p1, Lyu2;

    .line 2
    .line 3
    iget-object v0, p0, Lyu2;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lyu2;->b:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 6
    .line 7
    invoke-direct {p1, v0, p0, p2}, Lyu2;-><init>(Ljava/lang/String;Lcom/usercentrics/sdk/ui/components/UCImageView;Lc10;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ly10;

    .line 2
    .line 3
    check-cast p2, Lc10;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyu2;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lyu2;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lyu2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lyu2;->a:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/pixplicity/sharp/Sharp;->loadString(Ljava/lang/String;)Lcom/pixplicity/sharp/Sharp;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p0, p0, Lyu2;->b:Lcom/usercentrics/sdk/ui/components/UCImageView;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lcom/pixplicity/sharp/Sharp;->into(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method
