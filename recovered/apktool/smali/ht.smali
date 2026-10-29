.class public final Lht;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Lht;

.field public static final b:Ldd;

.field public static c:I

.field public static final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lht;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lht;->a:Lht;

    .line 7
    .line 8
    new-instance v0, Ldd;

    .line 9
    .line 10
    invoke-direct {v0}, Ldd;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lht;->b:Ldd;

    .line 14
    .line 15
    :try_start_0
    sget-object v0, Lo42;->b:Lm42;

    .line 16
    .line 17
    const-string v0, "kotlinx.serialization.json.pool.size"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    sget-object v1, Lo42;->b:Lm42;

    .line 33
    .line 34
    new-instance v1, Ln42;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Ln42;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_0
    nop

    .line 41
    instance-of v1, v0, Ln42;

    .line 42
    .line 43
    if-eqz v1, :cond_0

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    :cond_0
    check-cast v0, Ljava/lang/Integer;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/high16 v0, 0x100000

    .line 56
    .line 57
    :goto_1
    sput v0, Lht;->d:I

    .line 58
    .line 59
    return-void
.end method
