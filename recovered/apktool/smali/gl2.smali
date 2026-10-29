.class public final Lgl2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lk51;

.field public final b:Lv3;

.field public c:Lcom/usercentrics/tcf/core/model/gvl/VendorList;

.field public d:Lcom/usercentrics/tcf/core/model/gvl/Declarations;


# direct methods
.method public constructor <init>(Lk51;Lv3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgl2;->a:Lk51;

    .line 5
    .line 6
    iput-object p2, p0, Lgl2;->b:Lv3;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lel2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lel2;

    .line 7
    .line 8
    iget v1, v0, Lel2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lel2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lel2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lel2;-><init>(Lgl2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lel2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lel2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lel2;->a:Lgl2;

    .line 37
    .line 38
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v0, Lel2;->a:Lgl2;

    .line 53
    .line 54
    iput v3, v0, Lel2;->d:I

    .line 55
    .line 56
    iget-object p2, p0, Lgl2;->b:Lv3;

    .line 57
    .line 58
    invoke-virtual {p2, p1, v0}, Lv3;->i(Ljava/lang/String;Ld10;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-ne p2, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p2, Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 66
    .line 67
    iput-object p2, p0, Lgl2;->d:Lcom/usercentrics/tcf/core/model/gvl/Declarations;

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0
.end method

.method public final b(Ld10;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lfl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lfl2;

    .line 7
    .line 8
    iget v1, v0, Lfl2;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lfl2;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lfl2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lfl2;-><init>(Lgl2;Ld10;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lfl2;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Lz10;->a:Lz10;

    .line 28
    .line 29
    iget v2, v0, Lfl2;->d:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p0, v0, Lfl2;->a:Lgl2;

    .line 37
    .line 38
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput-object p0, v0, Lfl2;->a:Lgl2;

    .line 53
    .line 54
    iput v3, v0, Lfl2;->d:I

    .line 55
    .line 56
    iget-object p1, p0, Lgl2;->a:Lk51;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, Lk51;->k(Ld10;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p1, Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 66
    .line 67
    iput-object p1, p0, Lgl2;->c:Lcom/usercentrics/tcf/core/model/gvl/VendorList;

    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0
.end method
