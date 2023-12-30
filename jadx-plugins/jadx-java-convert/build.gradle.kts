plugins {
	id("jadx-library")
}

dependencies {
	api(project(":jadx-core"))

	implementation(project(":jadx-plugins:jadx-dex-input"))
	implementation("com.jakewharton.android.repackaged:dalvik-dx:11.0.0_r3")
	implementation("com.android.tools:r8:8.2.33")

	implementation("org.ow2.asm:asm:9.6")
}
