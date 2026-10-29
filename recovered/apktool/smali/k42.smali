.class public final Lk42;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public static a(I)Ll42;
    .locals 2

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p0, v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Ll42;->d:Ll42;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/Throwable;

    .line 13
    .line 14
    const-string v1, "Invalid Value for RestrictionType: "

    .line 15
    .line 16
    invoke-static {p0, v1}, Lfm0;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-direct {v0, p0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    sget-object p0, Ll42;->c:Ll42;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    sget-object p0, Ll42;->b:Ll42;

    .line 28
    .line 29
    return-object p0
.end method
