.class public final Lc12;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Double;

.field public final synthetic d:Landroid/app/Application;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ld12;

.field public final synthetic i:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ljava/lang/Double;Landroid/app/Application;Ljava/lang/String;Ld12;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc12;->c:Ljava/lang/Double;

    .line 2
    .line 3
    iput-object p2, p0, Lc12;->d:Landroid/app/Application;

    .line 4
    .line 5
    iput-object p3, p0, Lc12;->e:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lc12;->f:Ld12;

    .line 8
    .line 9
    iput-object p5, p0, Lc12;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Ltj2;-><init>(ILc10;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 7

    .line 1
    new-instance v0, Lc12;

    .line 2
    .line 3
    iget-object v4, p0, Lc12;->f:Ld12;

    .line 4
    .line 5
    iget-object v5, p0, Lc12;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    iget-object v1, p0, Lc12;->c:Ljava/lang/Double;

    .line 8
    .line 9
    iget-object v2, p0, Lc12;->d:Landroid/app/Application;

    .line 10
    .line 11
    iget-object v3, p0, Lc12;->e:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lc12;-><init>(Ljava/lang/Double;Landroid/app/Application;Ljava/lang/String;Ld12;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lc12;->b:Ljava/lang/Object;

    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, Lc12;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lc12;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lc12;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lc12;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x1

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v4, :cond_1

    .line 11
    .line 12
    if-ne v1, v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :cond_1
    :goto_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    check-cast p1, Lo42;

    .line 25
    .line 26
    iget-object p1, p1, Lo42;->a:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v10, p0

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lc12;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, Ly10;

    .line 36
    .line 37
    iget-object p1, p0, Lc12;->c:Ljava/lang/Double;

    .line 38
    .line 39
    iget-object v6, p0, Lc12;->d:Landroid/app/Application;

    .line 40
    .line 41
    iget-object v7, p0, Lc12;->e:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    sget-object v5, Lcom/google/android/recaptcha/Recaptcha;->INSTANCE:Lcom/google/android/recaptcha/Recaptcha;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    double-to-long v8, v8

    .line 52
    iput v4, p0, Lc12;->a:I

    .line 53
    .line 54
    move-object v10, p0

    .line 55
    invoke-virtual/range {v5 .. v10}, Lcom/google/android/recaptcha/Recaptcha;->getClient-BWLJW6A(Landroid/app/Application;Ljava/lang/String;JLc10;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-ne p1, v0, :cond_4

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object v10, p0

    .line 63
    sget-object v5, Lcom/google/android/recaptcha/Recaptcha;->INSTANCE:Lcom/google/android/recaptcha/Recaptcha;

    .line 64
    .line 65
    iput v3, v10, Lc12;->a:I

    .line 66
    .line 67
    const-wide/16 v8, 0x0

    .line 68
    .line 69
    const/4 v11, 0x4

    .line 70
    const/4 v12, 0x0

    .line 71
    invoke-static/range {v5 .. v12}, Lcom/google/android/recaptcha/Recaptcha;->getClient-BWLJW6A$default(Lcom/google/android/recaptcha/Recaptcha;Landroid/app/Application;Ljava/lang/String;JLc10;ILjava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-ne p1, v0, :cond_4

    .line 76
    .line 77
    :goto_1
    return-object v0

    .line 78
    :cond_4
    :goto_2
    sget-object p0, Lo42;->b:Lm42;

    .line 79
    .line 80
    instance-of p0, p1, Ln42;

    .line 81
    .line 82
    iget-object v0, v10, Lc12;->i:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 83
    .line 84
    if-nez p0, :cond_5

    .line 85
    .line 86
    move-object p0, p1

    .line 87
    check-cast p0, Lcom/google/android/recaptcha/RecaptchaClient;

    .line 88
    .line 89
    iget-object v1, v10, Lc12;->f:Ld12;

    .line 90
    .line 91
    iput-object p0, v1, Ld12;->b:Lcom/google/android/recaptcha/RecaptchaClient;

    .line 92
    .line 93
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    invoke-interface {v0, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    invoke-static {p1}, Lo42;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    if-eqz p0, :cond_6

    .line 103
    .line 104
    const-string p1, "FL_INIT_FAILED"

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-interface {v0, p1, p0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0
.end method
