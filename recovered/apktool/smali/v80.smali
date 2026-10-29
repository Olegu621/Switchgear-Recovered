.class public final Lv80;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:J

.field public final synthetic c:Lx80;

.field public final synthetic d:Ltm;

.field public final synthetic e:Lec;


# direct methods
.method public constructor <init>(JLx80;Ltm;Lec;Lc10;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lv80;->b:J

    .line 2
    .line 3
    iput-object p3, p0, Lv80;->c:Lx80;

    .line 4
    .line 5
    iput-object p4, p0, Lv80;->d:Ltm;

    .line 6
    .line 7
    iput-object p5, p0, Lv80;->e:Lec;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p6}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 7

    .line 1
    new-instance v0, Lv80;

    .line 2
    .line 3
    iget-object v4, p0, Lv80;->d:Ltm;

    .line 4
    .line 5
    iget-object v5, p0, Lv80;->e:Lec;

    .line 6
    .line 7
    iget-wide v1, p0, Lv80;->b:J

    .line 8
    .line 9
    iget-object v3, p0, Lv80;->c:Lx80;

    .line 10
    .line 11
    move-object v6, p2

    .line 12
    invoke-direct/range {v0 .. v6}, Lv80;-><init>(JLx80;Ltm;Lec;Lc10;)V

    .line 13
    .line 14
    .line 15
    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lv80;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lv80;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lv80;->a:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Lu80;

    .line 25
    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    iget-object v4, p0, Lv80;->c:Lx80;

    .line 29
    .line 30
    iget-object v5, p0, Lv80;->d:Ltm;

    .line 31
    .line 32
    iget-object v6, p0, Lv80;->e:Lec;

    .line 33
    .line 34
    invoke-direct/range {v3 .. v8}, Lu80;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;Lc10;I)V

    .line 35
    .line 36
    .line 37
    iput v2, p0, Lv80;->a:I

    .line 38
    .line 39
    iget-wide v1, p0, Lv80;->b:J

    .line 40
    .line 41
    invoke-static {v1, v2, v3, p0}, Lqj3;->R(JLkotlin/jvm/functions/Function2;Lc10;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-ne p0, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0
.end method
