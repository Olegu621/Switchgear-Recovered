.class public final Lok2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqk2;


# direct methods
.method public synthetic constructor <init>(Lqk2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lok2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lok2;->b:Lqk2;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lok2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lok2;->b:Lqk2;

    .line 13
    .line 14
    iget-object v0, p0, Lqk2;->a:Li03;

    .line 15
    .line 16
    const-string v2, "Failed while trying to updateTCString method"

    .line 17
    .line 18
    invoke-interface {v0, v2, p1}, Li03;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, Lqk2;->i:Lib1;

    .line 22
    .line 23
    iget p1, p0, Lib1;->b:I

    .line 24
    .line 25
    add-int/2addr p1, v1

    .line 26
    iput p1, p0, Lib1;->b:I

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, Lkotlin/Unit;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p0, Lok2;->b:Lqk2;

    .line 37
    .line 38
    iget-object p1, p0, Lqk2;->d:Ljz;

    .line 39
    .line 40
    sget-object v0, Lkz2;->v:Lkz2;

    .line 41
    .line 42
    check-cast p1, Lmz;

    .line 43
    .line 44
    iget-object v2, p1, Lmz;->a:Lx80;

    .line 45
    .line 46
    new-instance v3, Lqh;

    .line 47
    .line 48
    const/4 v4, 0x0

    .line 49
    invoke-direct {v3, p1, v0, v4, v1}, Lqh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc10;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v3}, Lx80;->b(Lkotlin/jvm/functions/Function2;)Lec;

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lqk2;->i:Lib1;

    .line 56
    .line 57
    iget p1, p0, Lib1;->b:I

    .line 58
    .line 59
    add-int/2addr p1, v1

    .line 60
    iput p1, p0, Lib1;->b:I

    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
