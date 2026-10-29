.class public final Lb12;
.super Ltj2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Ld12;

.field public b:I

.field public final synthetic c:Ld12;

.field public final synthetic d:Landroid/app/Application;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public constructor <init>(Ld12;Landroid/app/Application;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb12;->c:Ld12;

    .line 2
    .line 3
    iput-object p2, p0, Lb12;->d:Landroid/app/Application;

    .line 4
    .line 5
    iput-object p3, p0, Lb12;->e:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lb12;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Ltj2;-><init>(ILc10;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lc10;)Lc10;
    .locals 6

    .line 1
    new-instance v0, Lb12;

    .line 2
    .line 3
    iget-object v3, p0, Lb12;->e:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v4, p0, Lb12;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 6
    .line 7
    iget-object v1, p0, Lb12;->c:Ld12;

    .line 8
    .line 9
    iget-object v2, p0, Lb12;->d:Landroid/app/Application;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lb12;-><init>(Ld12;Landroid/app/Application;Ljava/lang/String;Lio/flutter/plugin/common/MethodChannel$Result;Lc10;)V

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
    invoke-virtual {p0, p1, p2}, Lb12;->create(Ljava/lang/Object;Lc10;)Lc10;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lb12;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lb12;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    sget-object v0, Lz10;->a:Lz10;

    .line 2
    .line 3
    iget v1, p0, Lb12;->b:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lb12;->f:Lio/flutter/plugin/common/MethodChannel$Result;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v4, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lb12;->a:Ld12;

    .line 14
    .line 15
    :try_start_0
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, Lf42;->l(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v2

    .line 27
    :cond_1
    invoke-static {p1}, Lpg3;->A(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :try_start_1
    iget-object p1, p0, Lb12;->c:Ld12;

    .line 31
    .line 32
    sget-object v1, Lcom/google/android/recaptcha/Recaptcha;->INSTANCE:Lcom/google/android/recaptcha/Recaptcha;

    .line 33
    .line 34
    iget-object v5, p0, Lb12;->d:Landroid/app/Application;

    .line 35
    .line 36
    iget-object v6, p0, Lb12;->e:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p1, p0, Lb12;->a:Ld12;

    .line 39
    .line 40
    iput v4, p0, Lb12;->b:I

    .line 41
    .line 42
    invoke-virtual {v1, v5, v6, p0}, Lcom/google/android/recaptcha/Recaptcha;->fetchClient(Landroid/app/Application;Ljava/lang/String;Lc10;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-ne p0, v0, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    move-object v7, p1

    .line 50
    move-object p1, p0

    .line 51
    move-object p0, v7

    .line 52
    :goto_0
    check-cast p1, Lcom/google/android/recaptcha/RecaptchaClient;

    .line 53
    .line 54
    iput-object p1, p0, Ld12;->b:Lcom/google/android/recaptcha/RecaptchaClient;

    .line 55
    .line 56
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-interface {v3, p0}, Lio/flutter/plugin/common/MethodChannel$Result;->success(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :goto_1
    const-string p1, "FL_INIT_FAILED"

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-interface {v3, p1, p0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0
.end method
