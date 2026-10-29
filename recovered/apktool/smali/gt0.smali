.class public final Lgt0;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/Exception;

.field public final c:Lym1;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Lym1;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgt0;->b:Ljava/lang/Exception;

    .line 5
    .line 6
    iput-object p2, p0, Lgt0;->c:Lym1;

    .line 7
    .line 8
    iput-object p3, p0, Lgt0;->a:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method public static a(Ljava/lang/Exception;Lym1;Ljava/lang/String;)Lgt0;
    .locals 1

    .line 1
    instance-of v0, p0, Lgt0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p0, Lgt0;

    .line 6
    .line 7
    iget-object v0, p0, Lgt0;->b:Ljava/lang/Exception;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lgt0;->a:Ljava/lang/String;

    .line 12
    .line 13
    move-object p2, p0

    .line 14
    :cond_0
    move-object p0, v0

    .line 15
    :cond_1
    new-instance v0, Lgt0;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, p2}, Lgt0;-><init>(Ljava/lang/Exception;Lym1;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
