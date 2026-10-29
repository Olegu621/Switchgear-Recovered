.class public final Lzap/m;
.super Ljava/lang/Object;
.source "m.java"


# static fields
.field private static final DIAGNOSTICS:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    const-string v0, "FUSION"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native b()Z
.end method

.method public static native c(Lzap/ab;)V
.end method

.method public static start(Landroid/content/Context;)Z
    .locals 1

    .line 73
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lzap/s;->b(Landroid/content/Context;Lzap/ar;)V

    .line 76
    invoke-static {}, Lzap/m;->b()Z

    move-result p0

    .line 78
    return p0
.end method

.method private static startLoaderTrace()V
    .locals 0

    .line 66
    return-void
.end method
